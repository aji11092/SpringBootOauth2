package com.Test.repository;



import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Test.model.User;


public interface UserRepository extends JpaRepository<User, UUID> {
	User findOneByUsername(String username);
}
