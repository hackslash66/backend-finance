package com.lti.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.lti.entity.Product;
import com.lti.service.ProductService;

/**
 * 
 * @author  venkat
 *
 */

public class ProductRestController {
 
	@Autowired
	private ProductService service;
	
	@PostMapping(value = "/add", consumes = "application/json")
	public String addProduct(@RequestBody Product product) {
		service.persist(product);
		return "Product added successfully";
	}
	
	@GetMapping(value = "/fetch/{id}", produces = "application/json")
	public Product fetchProduct(@PathVariable String pname) {
		return service.find(pname);
	}
	
	@GetMapping(value = "/list", produces = "application/json")
	public List<Product> listEmployee(){
		return service.load();
	}
	
}
