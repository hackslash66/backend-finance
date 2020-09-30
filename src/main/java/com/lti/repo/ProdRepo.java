package com.lti.repo;

import java.util.List;

import com.lti.entity.Product;

public interface ProdRepo {
	
	void save(Product prod);
	
	Product fetch(String pname);
	
	List<Product> list();
}
