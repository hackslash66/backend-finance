package com.lti.service;

import java.util.List;


import com.lti.entity.User;

public interface UserService {
void persist(User user);
	
	User find(String uname);
	
	List<User> load();
	
	void edit(User emp);
}
