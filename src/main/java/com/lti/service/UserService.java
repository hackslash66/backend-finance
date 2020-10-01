package com.lti.service;

import java.util.List;


import com.lti.entity.User;
import com.lti.pojo.Login;

/**
 * 
 * @author Yashwanth
 *
 */
public interface UserService {
void persist(User user);
	
	User find(String uname);
	
	List<User> load();
	
	void edit(User emp);
	
	User validate(Login login);
}
