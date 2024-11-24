package com.Ehipje.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ehipje.dtos.UserDto;
import com.Ehipje.models.User;
import com.Ehipje.repositories.UserRepository;

@Service
public class UserService {

	
	@Autowired
	UserRepository userRepository;
	
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User findById(UUID id) {
		return userRepository.findById(id).orElseThrow(() -> new RuntimeException("Cannot be found"));
	}
	
	public User createUser(UserDto userDto) {
		var user = new User();
		BeanUtils.copyProperties(userDto, user);
		return userRepository.save(user);
	}
	
	public User updateUser(UserDto userDto, UUID id) {
		var user = findById(id);
		
	}
	public User addCaracter(UUID idCaracter, UUID id) {
		var user = findById(id);
		var caracter = findcaracte.findbyid()
		user.setCaracters(null);
	}
}
