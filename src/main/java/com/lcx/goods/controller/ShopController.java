package com.lcx.goods.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lcx.goods.domain.Condition;
import com.lcx.goods.domain.Good;
import com.lcx.goods.domain.Shop;
import com.lcx.goods.service.ShopService;


@Controller
public class ShopController {
	
	@Resource
	private ShopService shopService;
	
	@RequestMapping("shops")
	public String shops(Model model,Condition condition) {
		if(condition.getPageNum()==null) {
			condition.setPageNum(1);
		}
		PageHelper.startPage(condition.getPageNum(), 3);
		
		List<Shop> shops = shopService.selects(condition);
		
		PageInfo<Shop> page = new PageInfo<Shop>(shops);
		model.addAttribute("shops", shops);
		model.addAttribute("condition", condition);
		model.addAttribute("page", page);
		
		return "shops";
		
	}
	
	
	@GetMapping("add")
	public String add() {
		
		return "add";
	}
	
	
	@ResponseBody
	@GetMapping("selectGoods")
	public List<Good> selectGoods() {
		
		return shopService.selectGoods();
	}
	
	
	
	@ResponseBody
	@PostMapping("add")
	public boolean add(Shop shop,Integer[] gids) {
		return shopService.insertShop(shop, gids);
	}
	
	
	@ResponseBody
	@RequestMapping("delete")
	public Object delete(Integer[] sids) {
		boolean flag = shopService.delete(sids);
		return flag;
	}
	
	
	@GetMapping("/detail")
	public String detail(Integer id,Model model) {
		
		Shop shop = shopService.select(id);
		model.addAttribute("shop", shop);
		return "shop";
		
	}
	 
}
