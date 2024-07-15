package com.shopease.entity;

import java.util.List;

public class Inventory {

	private Long id;

	private String location;

	private Integer stockQuantity;

	private List<Product> products;

	public Inventory() {
		super();
	}

	public Inventory(Long id, String location, Integer stockQuantity, List<Product> products) {
		super();
		this.id = id;
		this.location = location;
		this.stockQuantity = stockQuantity;
		this.products = products;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(Integer stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
