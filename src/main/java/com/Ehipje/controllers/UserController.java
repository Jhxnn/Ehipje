package com.Ehipje.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ehipje.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	
	@Autowired
	UserService userService;
	
	
	
}
