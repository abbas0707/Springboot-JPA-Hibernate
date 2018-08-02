package com.springboot.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.jpa.dao.UserDao;
import com.springboot.jpa.entities.User;

@RestController
public class UserController {
	@Autowired
	private UserDao userDao;
	
	@RequestMapping(value = "/addUser", method= RequestMethod.POST)
	public User addUser(@RequestBody User user) {		
		 userDao.insert(user);
		 return userDao.findUserById(user.getId());
		
	}
	
	@RequestMapping(value = "/updateUser", method= RequestMethod.POST)
	public User updateUser(@RequestBody User user) {		
		 userDao.update(user);
		 return user;
		
	}
	
	
	@RequestMapping(path = "/getall", method = RequestMethod.GET)
	public List<User> getAlluser() {		 
		 return userDao.findAll();				
	}
	
	@RequestMapping(path = "/remove/{id}", method = RequestMethod.GET)
	public void removeUser(@PathVariable(name="id")long id) {		
		userDao.delete(userDao.findUserById(id));	
						
	}

}
