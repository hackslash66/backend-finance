package com.lti.service;

import java.util.List;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.Order;
import com.lti.repo.OrderRepo;
import com.lti.repo.UserRepo;

/**
 * 
 * @author akshara
 *
 */
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepo repo;
	
	@Override
	@Transactional(value = TxType.REQUIRED)
	public void persist(Order ord) {
		repo.save(ord);

	}

	@Override
	public List<Order> load(String uname) {		
		List<Order> result = repo.list(uname);		
		return result;
	}

}
