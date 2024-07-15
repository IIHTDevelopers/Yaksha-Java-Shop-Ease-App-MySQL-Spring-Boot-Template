package com.shopease.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopease.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	// write logic for finding User by username

	// write logic for finding User by email
}
