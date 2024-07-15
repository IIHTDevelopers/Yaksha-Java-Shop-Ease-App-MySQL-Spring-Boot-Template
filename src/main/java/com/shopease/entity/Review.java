package com.shopease.entity;

public class Review {

	private Long id;

	private String comment;

	private Integer rating;

	private Product product;

	private User user;

	public Review() {
		super();
	}

	public Review(Long id, String comment, Integer rating, Product product, User user) {
		super();
		this.id = id;
		this.comment = comment;
		this.rating = rating;
		this.product = product;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
