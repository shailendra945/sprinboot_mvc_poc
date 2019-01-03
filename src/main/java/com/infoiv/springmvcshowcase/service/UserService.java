package com.infoiv.springmvcshowcase.service;

import com.infoiv.springmvcshowcase.model.User;

public interface UserService {
	public void save(User user);
	public User findByUsername(String username);

}
