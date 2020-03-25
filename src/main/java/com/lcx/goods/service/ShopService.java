package com.lcx.goods.service;

import java.util.List;

import com.lcx.goods.domain.Condition;
import com.lcx.goods.domain.Good;
import com.lcx.goods.domain.Shop;

public interface ShopService {
	/**
	 * 
	 * @Title: selects 
	 * @Description: 商铺列表
	 * @return
	 * @return: List<Shop>
	 */
	List<Shop> selects(Condition condition);
	

	/**
	 * 
	 * @Title: selectGoods 
	 * @Description: 查询所有商品
	 * @return
	 * @return: List<Good>
	 */
	List<Good> selectGoods();
	/**
	 * 
	 * @Title: insertShop 
	 * @Description: 增加商铺
	 * @param shop
	 * @param gids
	 * @return
	 * @return: boolean
	 */
	boolean insertShop(Shop shop,Integer[] gids);
	
	/**
	 * 
	 * @Title: delete 
	 * @Description: 删除商铺
	 * @param sids
	 * @return
	 * @return: boolean
	 */
	boolean delete(Integer[] sids);
	
	
	/**
	 * 
	 * @Title: select 
	 * @Description: 查询单个商铺
	 * @param sid
	 * @return
	 * @return: Shop
	 */
	Shop select(Integer id);
}
