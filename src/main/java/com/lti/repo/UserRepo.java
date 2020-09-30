package com.lti.repo;

import java.util.List;


import com.lti.entity.User;
import com.lti.pojo.Login;

public interface UserRepo {
void save(User user);
	
	User fetch(String uname);
	
	List<User> list();
	
	void update(User user);
	
	User verifyLogin(Login login);
}
