package com.bookstore.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.bookstore.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
}
