package com.lcx.goods.service;

import java.util.List;

import com.lcx.goods.domain.Condition;
import com.lcx.goods.domain.Good;
import com.lcx.goods.domain.Shop;

public interface ShopService {
	/**
	 * 
	 * @Title: selects 
	 * @Description: �����б�
	 * @return
	 * @return: List<Shop>
	 */
	List<Shop> selects(Condition condition);
	

	/**
	 * 
	 * @Title: selectGoods 
	 * @Description: ��ѯ������Ʒ
	 * @return
	 * @return: List<Good>
	 */
	List<Good> selectGoods();
	/**
	 * 
	 * @Title: insertShop 
	 * @Description: ��������
	 * @param shop
	 * @param gids
	 * @return
	 * @return: boolean
	 */
	boolean insertShop(Shop shop,Integer[] gids);
	
	/**
	 * 
	 * @Title: delete 
	 * @Description: ɾ������
	 * @param sids
	 * @return
	 * @return: boolean
	 */
	boolean delete(Integer[] sids);
	
	
	/**
	 * 
	 * @Title: select 
	 * @Description: ��ѯ��������
	 * @param sid
	 * @return
	 * @return: Shop
	 */
	Shop select(Integer id);
}
