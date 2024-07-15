package com.shopease.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopease.entity.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
	// write logic for finding all inventories by location

	// write logic for finding all inventories which have lower stock quantity than
	// passed argument
}
