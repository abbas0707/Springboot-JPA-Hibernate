package com.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.jpa.dao.UserDao;
import com.springboot.jpa.entities.User;
  
@SpringBootApplication
public class UserEntityManagerCommandLineRunner implements CommandLineRunner {
	private static final Logger log = LoggerFactory.getLogger(UserEntityManagerCommandLineRunner.class);

	@Autowired
	private UserDao userService;
	public static void main(String[] args) {
		SpringApplication.run(UserEntityManagerCommandLineRunner.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		  log.info("-------------------------------");
		  log.info("Adding Tom as Admin");
		  log.info("-------------------------------");
		  User tom = new User("Tom", "Admin");
		  userService.insert(tom);
		  log.info("Inserted Tom" + tom);
		  log.info("-------------------------------");
		  log.info("Finding user with id 1");
		  log.info("-------------------------------");
		  User user = userService.findUserById(1l);
		  log.info(user.toString());
		  log.info("-------------------------------");
		  log.info("Finding all users");
		  log.info("-------------------------------");
		  log.info(userService.findAll().toString());

		 }


}
