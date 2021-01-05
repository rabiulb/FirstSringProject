package com.jackrututorial.service;

import com.jackrututorial.model.User;

public interface UserService {
	
	public User findUserByEmail(String email);
	 
	 public void saveUser(User user);

}
