package com.lti.service;

import java.util.List;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.Product;
import com.lti.repo.ProdRepo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProdRepo repo;
	
	@Transactional(value = TxType.REQUIRED)
	@Override
	public void persist(Product product) {
		repo.save(product);
	}

	@Override
	public List<Product> load() {
		return repo.list();
	}

	@Override
	public Product find(String pname) {
		return repo.fetch(pname);
	}
}
