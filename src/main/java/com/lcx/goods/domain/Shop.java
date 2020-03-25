package com.lcx.goods.domain;
/**
 * 
 * @ClassName: Shop 
 * @Description: TODO
 * @author: charles
 * @date: 2020骞�3鏈�20鏃� 涓婂崍11:43:16
 */

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class Shop  implements Serializable{
	private  Integer id;
	private String name;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date created;
	
	private List<Good> goods;//鍟嗗搧
	
	
	
	
	public List<Good> getGoods() {
		return goods;
	}
	public void setGoods(List<Good> goods) {
		this.goods = goods;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
