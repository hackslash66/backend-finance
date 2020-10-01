package com.lti.repo;

import java.util.List;

import com.lti.entity.Product;

/**
 * @author Surya
 *
 * @version 1.8
 */

public interface ProdRepo {
	
	void save(Product prod);
	
	Product fetch(String pname);
	
	List<Product> list();
}
