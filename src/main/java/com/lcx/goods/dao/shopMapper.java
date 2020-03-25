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
	 * @Title: insert 
	 * @Description: �������
	 * @param shop
	 * @return
	 * @return: int
	 */
	int insert(Shop shop);
	/**
	 * 
	 * @Title: insertMiddle 
	 * @Description: ����м��
	 * @param sid
	 * @param gids
	 * @return
	 * @return: int
	 */
	int insertMiddle(@Param("sid")Integer sid,@Param("gids")Integer[] gids);
	
	/**
	 * 
	 * @Title: deleteShop 
	 * @Description: ɾ�����̱�
	 * @param sids
	 * @return
	 * @return: int
	 */
	int deleteShop(Integer[] sids);
	/**
	 * 
	 * @Title: deleteMiddle 
	 * @Description: ɾ���м��
	 * @param sids
	 * @return
	 * @return: int
	 */
	int deleteMiddle(Integer[] sids);
	
	Shop select(Integer id);
	
}
