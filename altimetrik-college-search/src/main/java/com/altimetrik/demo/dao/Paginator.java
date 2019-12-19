package com.altimetrik.demo.dao;

import java.io.Serializable;

public class Paginator  implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int total;
	private int page;
	private int per_page;
	private int pages;
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPer_page() {
		return per_page;
	}
	public void setPer_page(int per_page) {
		this.per_page = per_page;
	}
	

	public void setPages() {
		this.pages = (int) this.total / this.per_page;
	}
	
	@Override
	public String toString() {
		return "Page: " + this.page + " Per_Page: " + this.per_page + " Total: " + this.total; 
	}

}
