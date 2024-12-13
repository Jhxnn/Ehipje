package com.Ehipje.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ehipje.models.Equipament;

public interface EquipamentRepository extends JpaRepository<Equipament, UUID>{

}
