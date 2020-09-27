package com.lti.repo;

import java.util.List;

import com.lti.entity.User;

public interface UserRepo {
void save(User user);
	
	User fetch(int uname);
	
	List<User> list();
}
