package com.lcx.goods.domain;

public class Condition {
		private Integer pageNum;
		
		private String name;

		public Condition(Integer pageNum, String name) {
			super();
			this.pageNum = pageNum;
			this.name = name;
		}

		public Condition() {
			super();
		}

		public Integer getPageNum() {
			return pageNum;
		}

		public void setPageNum(Integer pageNum) {
			this.pageNum = pageNum;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		
}
