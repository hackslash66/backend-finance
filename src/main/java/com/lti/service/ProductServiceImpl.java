package com.lti.service;

import java.util.List;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.Product;
import com.lti.repo.ProductRepo;

/**
 * 
 * @author Surya
 *
 */

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepo repo;

	@Transactional(value = TxType.REQUIRED)
	public void persist(Product product) {
		repo.save(product);
	}

	public List<Product> load() {
		return repo.list();
	}

	public Product find(int pId) {
		return repo.fetch(pId);
	}
}
