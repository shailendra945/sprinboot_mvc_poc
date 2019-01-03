package com.infoiv.springmvcshowcase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infoiv.springmvcshowcase.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByUsername(String name);

}
