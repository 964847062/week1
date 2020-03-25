package com.lcx.goods.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lcx.goods.dao.shopMapper;
import com.lcx.goods.domain.Condition;
import com.lcx.goods.domain.Good;
import com.lcx.goods.domain.Shop;
import com.lcx.goods.service.ShopService;

@Service
public class ShopServiceImpl implements ShopService {
	@Resource
	shopMapper shopMapper;
	
	@Override
	public List<Shop> selects(Condition condition) {
		// TODO Auto-generated method stub
		return shopMapper.selects(condition) ;
	}

	@Override
	public List<Good> selectGoods() {
		// TODO Auto-generated method stub
		return shopMapper.selectGoods();
	}

	@Override
	public boolean insertShop(Shop shop, Integer[] gids) {
		
		try {
			//增加店铺
			shopMapper.insert(shop);
			//增加中间表
			shopMapper.insertMiddle(shop.getId(), gids);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("创建店铺失败");
		}
	
	}

	@Override
	public boolean delete(Integer[] sids) {
		int i = shopMapper.deleteShop(sids);
		if(i>0) {
			i=shopMapper.deleteMiddle(sids);
		}
		return i>0;
	}

	@Override
	public Shop select(Integer id) {
		// TODO Auto-generated method stub
		return shopMapper.select(id);
	}

}
