package com.org.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.entities.User;

public interface UserDao extends JpaRepository<User, Long> {

	User findByUsername(String username);
}
