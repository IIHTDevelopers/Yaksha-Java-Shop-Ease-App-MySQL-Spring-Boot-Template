package com.shopease.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shopease.dto.InventoryDTO;
import com.shopease.dto.ProductDTO;
import com.shopease.service.InventoryService;

@Service
@Transactional
public class InventoryServiceImpl implements InventoryService {

	@Override
	public InventoryDTO addInventoryItem(InventoryDTO inventoryDTO) {
		// write your logic here
		return null;
	}

	@Override
	public List<InventoryDTO> getAllInventoryItems() {
		// write your logic here
		return null;
	}

	@Override
	public InventoryDTO getInventoryItemById(Long id) {
		// write your logic here
		return null;
	}

	@Override
	public InventoryDTO updateInventoryItem(Long id, InventoryDTO inventoryDTO) {
		// write your logic here
		return null;
	}

	@Override
	public Boolean deleteInventoryItem(Long id) {
		// write your logic here
		return null;
	}

	@Override
	public List<ProductDTO> getInventoryStatusOfProducts() {
		// write your logic here
		return null;
	}

	@Override
	public InventoryDTO updateProductInventory(Long productId, InventoryDTO inventoryDTO) {
		// write your logic here
		return null;
	}
}
