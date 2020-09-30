package com.lti.service;

import java.util.Base64;
import java.util.List;
import java.util.Base64.Encoder;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.User;
import com.lti.pojo.Login;
import com.lti.repo.UserRepo;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo repo;
	@Override
	
	@Transactional(value = TxType.REQUIRED)
	public void persist(User user) {
		// TODO Auto-generated method stub
		String pwd = user.getPwd();
		Encoder encoder = Base64.getEncoder();
		user.setPwd(new String((encoder.encode(pwd.getBytes()))));
		repo.save(user);
	}

	@Override
	public User find(String uname) {
		// TODO Auto-generated method stub
		return repo.fetch(uname);
	}

	@Override
	public List<User> load() {
		// TODO Auto-generated method stub
		return repo.list();
	}

	@Transactional(value = TxType.REQUIRED)
	public void edit(User user) {
		// TODO Auto-generated method stub
		repo.update(user);
	}

	@Override
	public User validate(Login login) {
		String pwd= login.getPwd();
		Encoder encoder = Base64.getEncoder();
		login.setPwd(new String(encoder.encode(pwd.getBytes())));
		
		return repo.verifyLogin(login);
		}
	}

}
