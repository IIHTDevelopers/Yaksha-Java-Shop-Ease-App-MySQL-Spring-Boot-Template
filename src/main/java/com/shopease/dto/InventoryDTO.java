package com.shopease.dto;

import java.util.List;

public class InventoryDTO {

	private Long id;

	private String location;

	private Integer stockQuantity;

	private List<ProductDTO> products;

	public InventoryDTO() {
		super();
	}

	public InventoryDTO(Long id, String location, Integer stockQuantity, List<ProductDTO> products) {
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

	public List<ProductDTO> getProducts() {
		return products;
	}

	public void setProducts(List<ProductDTO> products) {
		this.products = products;
	}
}
