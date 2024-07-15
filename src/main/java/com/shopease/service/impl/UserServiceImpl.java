package com.shopease.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shopease.dto.OrderDTO;
import com.shopease.dto.UserDTO;
import com.shopease.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Override
	public UserDTO register(UserDTO userDTO) {
		// write your logic here
		return null;
	}

	@Override
	public UserDTO getUserById(Long id) {
		// write your logic here
		return null;
	}

	@Override
	public UserDTO updateUser(Long id, UserDTO userDTO) {
		// write your logic here
		return null;
	}

	@Override
	public Boolean deleteUser(Long id) {
		// write your logic here
		return null;
	}

	@Override
	public List<OrderDTO> getUserOrders(Long userId) {
		// write your logic here
		return null;
	}
}
