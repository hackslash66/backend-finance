package com.lti.service;

import java.util.List;

import com.lti.entity.User;

public interface UserService {
void persist(User user);
	
	User find(int uname);
	
	List<User> load();
}
