package com.lti.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.stereotype.Repository;

import com.lti.entity.Order;
import com.lti.entity.Transaction;

/**
 * @author Yashwanth
 *
 * @version 1.8
 */

@Repository
public class TransactionRepoImpl implements TransactionRepo {

	@PersistenceContext
	private EntityManager em;

	@Transactional(value = TxType.REQUIRED)
	public void save(Transaction trans) {
		// TODO Auto-generated method stub
		em.persist(trans);
	}

	public List<Transaction> list(int orderID) {
		String sql = "SELECT * FROM transactions WHERE orderID=:orderID";
		Query q = em.createNativeQuery(sql, Transaction.class);
		q.setParameter("orderID", orderID);
		List<Transaction> transactions = q.getResultList();

		return transactions;
	}

}
