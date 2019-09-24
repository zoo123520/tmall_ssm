package com.entor.entity;

import java.sql.Timestamp;

public class Product {
	private int id;
	private String name;
	private String subtitle;
	private float orignalprice;
	private float promoteprice;
	private int stock;
	private int cid;
	private Timestamp createDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public float getOrignalprice() {
		return orignalprice;
	}
	public void setOrignalprice(float orignalprice) {
		this.orignalprice = orignalprice;
	}
	public float getPromoteprice() {
		return promoteprice;
	}
	public void setPromoteprice(float promoteprice) {
		this.promoteprice = promoteprice;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", subtitle=" + subtitle + ", orignalprice=" + orignalprice
				+ ", promoteprice=" + promoteprice + ", stock=" + stock + ", cid=" + cid + ", createDate=" + createDate
				+ "]";
	}
	
}
