package com.Ehipje.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ehipje.dtos.UserDto;
import com.Ehipje.models.User;
import com.Ehipje.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	
	@Autowired
	UserService userService;
	
	@GetMapping("/{id}")
	public ResponseEntity<User> findById(@PathVariable(name = "id") UUID id){
		var user = userService.findById(id);
		return ResponseEntity.status(HttpStatus.OK).body(user);
	}
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		return ResponseEntity.status(HttpStatus.OK).body(userService.findAll());
	}
	@GetMapping("/caracter/{id}")
	public ResponseEntity<User> findByCaracter(@PathVariable(name = "id") UUID id){
		return ResponseEntity.status(HttpStatus.OK).body(userService.findByCaracter(id));
	}
	
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody UserDto userDto){
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(userDto));
	}
	@PostMapping("/add_caracter/{userId}/{caracterId}")
	public ResponseEntity<User> addCaracter(@PathVariable(name = "userId")UUID userId,
											@PathVariable(name = "caracterId") UUID caracterId){
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.addCaracter(caracterId, userId));
	}
}
