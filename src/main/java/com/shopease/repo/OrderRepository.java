package com.shopease.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopease.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	// write logic for finding all orders by user id

	// write logic for finding all orders by status
}
