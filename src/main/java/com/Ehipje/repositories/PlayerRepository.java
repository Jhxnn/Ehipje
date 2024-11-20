package com.Ehipje.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ehipje.models.Caracter;

public interface PlayerRepository extends JpaRepository<Caracter, UUID>{
	
}