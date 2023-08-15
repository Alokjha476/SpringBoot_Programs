package com.jpa.test;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.ApplicationContext;


import com.jpa.test.dao.UserRepository;
import com.jpa.test.entity.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository =context.getBean(UserRepository.class);
		// create data in data base
//		User user = new User();
//		user.setId(2);
//		user.setName("dhani ram kumar");
//		user.setCity("Delhi");
//		user.setStatus("I m programmer");
//		User user1 = new User();
//		user1.setId(3);
//		user1.setName("Nk kumar");
//		user1.setCity("Delhi1");
//		user1.setStatus("I m programmers in java");
//		
//		List<User> users = List.of(user, user1);
//		Iterable<User> result = userRepository.saveAll(users); 
//		result.forEach(e->{
//			System.out.println(e);
//			
//		});
		// save only single user
//		User user1 = userRepository.save(user);
//		System.out.println(user);
//	save multiple user-->
		// update
//		Optional<User> optional =  userRepository.findById(2);   
//		User user = optional.get();
//		user.setName("Ankit ");
//		user.setId(5);
//		user.setCity("Lukhnow");
//		user.setStatus("It");
//		User update =userRepository.save(user);
//		System.out.println(update);
		
		// find all user
		Iterable<User> itr = userRepository.findAll();
		itr.forEach(e->{
			System.out.println(e);
		});
		
		// delete
//			userRepository.deleteById(1);
//		System.out.println("deleted");
		
//		userRepository.deleteAll();
//		System.out.println("Deleted");
//		
	}

}
