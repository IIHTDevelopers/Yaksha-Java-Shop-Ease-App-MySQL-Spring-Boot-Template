package com.shopease.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shopease.dto.ProductDTO;
import com.shopease.dto.ReviewDTO;
import com.shopease.service.ProductService;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Override
	public ProductDTO addProduct(ProductDTO productDTO) {
		// write your logic here
		return null;
	}

	@Override
	public List<ProductDTO> getAllProducts() {
		// write your logic here
		return null;
	}

	@Override
	public ProductDTO getProductById(Long id) {
		// write your logic here
		return null;
	}

	@Override
	public ProductDTO updateProduct(Long id, ProductDTO productDTO) {
		// write your logic here
		return null;
	}

	@Override
	public Boolean deleteProduct(Long id) {
		// write your logic here
		return null;
	}

	@Override
	public List<ReviewDTO> getProductReviews(Long productId) {
		// write your logic here
		return null;
	}

	@Override
	public ReviewDTO addProductReview(Long productId, ReviewDTO reviewDTO) {
		// write your logic here
		return null;
	}

	@Override
	public List<ProductDTO> searchProducts(String criteria) {
		// write your logic here
		return null;
	}
}
