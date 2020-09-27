package com.lti.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.User;
import com.lti.service.UserService;

@CrossOrigin
@RestController
public class UserRestController {
	@Autowired
	private UserService service;
	@PostMapping(value = "/add", consumes = "application/json")
	public String addUser(@RequestBody User user) {
		service.persist(user);
		return "User added successfully";
	}
	
	@GetMapping(value = "/fetch/{id}", produces = "application/json")
	public User fetchUser(@PathVariable int uname) {
		return service.find(uname);
	}
	
	@GetMapping(value = "/list", produces = "application/json")
	public List<User> listEmployee(){
		return service.load();
	}
}
