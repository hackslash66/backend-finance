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

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		em.persist(user);
	}

	@Override
	public User fetch(String uname) {
		// TODO Auto-generated method stub
		return em.find(User.class, uname);
	}

	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		return em.createQuery("from User").getResultList();
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		em.merge(user);

	}

	@Override
	public User verifyLogin(Login login) {
		Query query = em.createNamedQuery("login");
		query.setParameter("uname", login.getUname());
		query.setParameter("pwd", login.getPwd());
		return (User) query.getSingleResult();
	}

}
