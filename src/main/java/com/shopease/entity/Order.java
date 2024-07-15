package com.shopease.entity;

import java.util.Date;

public class Order {

	private Long id;

	private User user;

	private Product product;

	private Date orderDate;

	private String status;

	public Order() {
		super();
	}

	public Order(Long id, User user, Product product, Date orderDate, String status) {
		super();
		this.id = id;
		this.user = user;
		this.product = product;
		this.orderDate = orderDate;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
