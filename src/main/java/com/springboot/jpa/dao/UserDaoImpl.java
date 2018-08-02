package com.springboot.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.springboot.jpa.entities.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

	@PersistenceContext
	private EntityManager entityManager;

	public long insert(User user) {
		entityManager.persist(user);
		return user.getId();
	}

	public User findUserById(long id) {
		return entityManager.find(User.class, id);
	}

	public List<User> findAll() {
		Query query = entityManager.createNamedQuery("query_find_all_users", User.class);
		return query.getResultList();
	}

	public User update(User user) {
		entityManager.merge(user);
		return user;
	}

	public void delete(User user) {
		entityManager.remove(user);
	}

}
