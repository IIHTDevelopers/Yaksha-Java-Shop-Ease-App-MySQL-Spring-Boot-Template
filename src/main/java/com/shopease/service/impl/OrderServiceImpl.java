package com.shopease.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shopease.dto.OrderDTO;
import com.shopease.service.OrderService;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

	@Override
	public OrderDTO createOrder(OrderDTO orderDTO) {
		// write your logic here
		return null;
	}

	@Override
	public List<OrderDTO> getAllOrders() {
		// write your logic here
		return null;
	}

	@Override
	public OrderDTO getOrderById(Long id) {
		// write your logic here
		return null;
	}

	@Override
	public OrderDTO updateOrder(Long id, OrderDTO orderDTO) {
		// write your logic here
		return null;
	}

	@Override
	public Boolean cancelOrder(Long id) {
		// write your logic here
		return null;
	}

	@Override
	public String getOrderStatus(Long id) {
		// write your logic here
		return null;
	}

	@Override
	public Boolean updateOrderStatus(Long id, String status) {
		// write your logic here
		return null;
	}

	@Override
	public Boolean initiateReturn(Long id) {
		// write your logic here
		return null;
	}
}
