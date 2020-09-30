package com.lti.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.entity.Product;
import com.lti.entity.User;

@Repository
public class ProdRepoImpl implements ProdRepo {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void save(Product prod) {
		
		em.persist(prod);
	}

	@Override
	public Product fetch(String pname) {
		
		return em.find(Product.class, pname);
	}

	@Override
	public List<Product> list() {
		return (List<Product>)em.createQuery("from product").getResultList();
	}

}
