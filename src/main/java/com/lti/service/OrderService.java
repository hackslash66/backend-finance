package com.lti.service;

import java.util.List;

import com.lti.entity.Order;

public interface OrderService {
	
	void persist(Order ord);
	
	
	List<Order> load(String uname);
}
