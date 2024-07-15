package com.shopease.dto;

public class ReviewDTO {

	private Long id;

	private String comment;

	private Integer rating;

	private ProductDTO product;

	private UserDTO user;

	public ReviewDTO() {
		super();
	}

	public ReviewDTO(Long id, String comment, Integer rating, ProductDTO product, UserDTO user) {
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

	public ProductDTO getProduct() {
		return product;
	}

	public void setProduct(ProductDTO product) {
		this.product = product;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}
}
