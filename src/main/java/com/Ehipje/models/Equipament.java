package com.Ehipje.models;

import java.util.UUID;

import com.Ehipje.models.enums.EquipamentType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "equipaments")
public class Equipament {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID equipamentId;
	
	private String name;
	
	private EquipamentType equipamentType;
	
	private int equipamentStatus;
	
	

}
