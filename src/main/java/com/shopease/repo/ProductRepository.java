package com.shopease.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopease.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	// write logic for finding all products by name

	// write logic for finding all products cheaper than passed price
}
