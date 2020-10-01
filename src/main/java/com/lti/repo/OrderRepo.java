package com.lti.repo;

import java.util.List;

import com.lti.entity.Order;
import com.lti.entity.User;

/**
 * 
 * @author akshara
 *
 */
public interface OrderRepo {


	void save(Order order);
	
	List<Order> list(String uname);
}
