package com.lti.repo;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.entity.Order;
import com.lti.entity.User;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * 
 * @author akshara
 *
 */
@Repository
public class OrderRepoImpl implements OrderRepo {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void save(Order order) {		
		em.persist(order);
	}

	@Override
	public List<Order> list(String uname) {		
		String sql="SELECT * FROM orders WHERE uname=:username";
		Query q = em.createNativeQuery(sql, Order.class);
		q.setParameter("username", uname);
		List<Order> orders = q.getResultList();
		
		return orders;		
	}	
}
