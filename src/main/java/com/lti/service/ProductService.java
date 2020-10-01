package com.lti.service;

import java.util.List;

import com.lti.entity.Product;

/**
 * 
 * @author Surya
 *
 */

public interface ProductService {
	
	void persist(Product product);
	
	Product find(String pname);
	
	List<Product> load();
}	

