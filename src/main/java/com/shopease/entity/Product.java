package com.shopease.entity;

import java.util.List;

public class Product {

	private Long id;

	private String name;

	private String description;

	private Double price;

	private List<Review> reviews;

	private Inventory inventory;

	public Product() {
		super();
	}

	public Product(Long id, String name, String description, Double price, List<Review> reviews, Inventory inventory) {
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

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
}
