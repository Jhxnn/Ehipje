package com.Ehipje.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ehipje.models.User;
import java.util.List;
import com.Ehipje.models.Caracter;


public interface UserRepository extends JpaRepository<User, UUID>{
	
	User findByCaracter(Caracter caracters);
}
