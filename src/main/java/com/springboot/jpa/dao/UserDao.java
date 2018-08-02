package com.springboot.jpa.dao;

import java.util.List;

import javax.persistence.Query;

import com.springboot.jpa.entities.User;

public interface UserDao {
	 public long insert(User user) ;	 
	 public User findUserById(long id) ;	 
	 public List<User> findAll();
	 public User update(User user);	 
	 public void delete(User user);
}
