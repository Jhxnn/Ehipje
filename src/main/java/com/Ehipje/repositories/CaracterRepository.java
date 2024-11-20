package com.Ehipje.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ehipje.models.Caracter;

public interface CaracterRepository extends JpaRepository<Caracter, UUID>{

}
