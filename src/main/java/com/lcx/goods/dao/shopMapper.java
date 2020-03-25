package com.lcx.goods.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lcx.goods.domain.Condition;
import com.lcx.goods.domain.Good;
import com.lcx.goods.domain.Shop;

public interface shopMapper {
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
	 * @Title: insert 
	 * @Description: 添加商铺
	 * @param shop
	 * @return
	 * @return: int
	 */
	int insert(Shop shop);
	/**
	 * 
	 * @Title: insertMiddle 
	 * @Description: 添加中间表
	 * @param sid
	 * @param gids
	 * @return
	 * @return: int
	 */
	int insertMiddle(@Param("sid")Integer sid,@Param("gids")Integer[] gids);
	
	/**
	 * 
	 * @Title: deleteShop 
	 * @Description: 删除商铺表
	 * @param sids
	 * @return
	 * @return: int
	 */
	int deleteShop(Integer[] sids);
	/**
	 * 
	 * @Title: deleteMiddle 
	 * @Description: 删除中间表
	 * @param sids
	 * @return
	 * @return: int
	 */
	int deleteMiddle(Integer[] sids);
	
	Shop select(Integer id);
	
}
