package com.lti.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lti.entity.Order;
import com.lti.entity.User;

/**
 * @author Akshara
 *
 * @version 1.8
 */
@Repository
public class OrderRepoImpl implements OrderRepo {

	@PersistenceContext
	private EntityManager em;

	@Transactional(value = TxType.REQUIRED)
	public void save(Order order) {

		em.persist(order);
	}

	public List<Order> list(String uname) {
		String sql = "SELECT * FROM orders WHERE uname=:username";
		Query q = em.createNativeQuery(sql, Order.class);
		q.setParameter("username", uname);
		List<Order> orders = q.getResultList();

		return orders;
	}

	public void update(Order ord) {
		// TODO Auto-generated method stub
		em.merge(ord);
	}

}
