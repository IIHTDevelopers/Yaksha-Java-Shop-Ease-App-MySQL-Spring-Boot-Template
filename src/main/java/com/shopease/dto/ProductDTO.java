package com.shopease.dto;

import java.util.List;

public class ProductDTO {

	private Long id;

	private String name;

	private String description;

	private Double price;

	private List<ReviewDTO> reviews;

	private InventoryDTO inventory;

	public ProductDTO() {
		super();
	}

	public ProductDTO(Long id, String name, String description, Double price, List<ReviewDTO> reviews,
			InventoryDTO inventory) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.reviews = reviews;
		this.inventory = inventory;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public List<ReviewDTO> getReviews() {
		return reviews;
	}

	public void setReviews(List<ReviewDTO> reviews) {
		this.reviews = reviews;
	}

	public InventoryDTO getInventory() {
		return inventory;
	}

	public void setInventory(InventoryDTO inventory) {
		this.inventory = inventory;
	}
}
