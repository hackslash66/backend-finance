package com.lti.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.entity.User;
import com.lti.pojo.Login;

/**
 * @author yashwanth
 *
 * @version 1.8
 */
@Repository
public class UserRepoImpl implements UserRepo {

	@PersistenceContext
	private EntityManager em;

	public void save(User user) {
		// TODO Auto-generated method stub
		em.persist(user);
	}

	public User fetch(String uname) {
		// TODO Auto-generated method stub
		return em.find(User.class, uname);
	}

	public List<User> list() {
		// TODO Auto-generated method stub
		return em.createQuery("from User").getResultList();
	}

	public void update(User user) {
		// TODO Auto-generated method stub
		em.merge(user);

	}

	public List<User> fetchIfYes() {
		Query query = em.createNamedQuery("fetchifyes");
		query.setParameter("approvalStatus", "yes");
		return query.getResultList();
	}

	public List<User> fetchAll() {

		return em.createQuery("from User").getResultList();

	}

	public User verifyLogin(Login login) {
		Query query = em.createNamedQuery("login");
		System.out.println(login.getUname());
		System.out.println(login.getPwd());
		query.setParameter("username", login.getUname());
		query.setParameter("password", login.getPwd());
		query.setParameter("status", "accepted");
		return (User) query.getSingleResult();
	}
}
