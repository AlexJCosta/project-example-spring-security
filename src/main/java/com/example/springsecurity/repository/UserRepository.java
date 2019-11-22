package com.example.springsecurity.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springsecurity.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	Optional<User> findByLogin(String login);

}
