package com.example.spring.security.auth.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.security.auth.users.User;
import com.example.spring.security.auth.users.UserRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class UserController {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/users")
	@PreAuthorize("hasRole('ADMIN')")
	public Page<User> userList(Pageable pageable) {

		
		Page<User> findAll = userRepository.findAll(pageable);

		findAll.forEach(usr -> usr.setPassword("********"));
		
		return findAll;

	}

}
