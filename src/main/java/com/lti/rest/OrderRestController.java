package com.lti.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.Order;
import com.lti.entity.Product;
import com.lti.entity.User;
import com.lti.service.OrderService;
import com.lti.service.ProductService;
import com.lti.service.UserService;

/**
 * 
 * @author akshara
 *
 */

@CrossOrigin
@RestController
public class OrderRestController {

	@Autowired
	private OrderService service;
	@Autowired
	private UserService uservice;
	@Autowired
	private ProductService pservice;
	
	@PostMapping(value = "/ord" )
	public String AddOrd(@RequestParam("orderDate") String date,
			@RequestParam("duration") String duration,
			@RequestParam("username") String username,
			@RequestParam("productId") int productID){
		User u = uservice.find(username);
		Product p = pservice.find(productID);
		Order o = new Order();
		o.setOrderDate(date);
		o.setEmiDuration(duration);
		o.setProd(p);
		o.setUser(u);
		service.persist(o);
		return "order added";
	}
	
	@GetMapping(value="/u_orders")
	public List<Order> fetchOrder(@RequestParam("username") String username) {
		List<Order> res=service.load(username);
		return res;
	}
}
