package com.Ehipje.models;

import java.util.UUID;

import com.Ehipje.models.enums.EquipamentType;

import jakarta.persistence.Column;
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
	@Column(name = "id")
	private UUID equipamentId;
	
	private String name;
	
	private EquipamentType equipamentType;
	
	private int equipamentStatus;

	public UUID getEquipamentId() {
		return equipamentId;
	}

	public void setEquipamentId(UUID equipamentId) {
		this.equipamentId = equipamentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EquipamentType getEquipamentType() {
		return equipamentType;
	}

	public void setEquipamentType(EquipamentType equipamentType) {
		this.equipamentType = equipamentType;
	}

	public int getEquipamentStatus() {
		return equipamentStatus;
	}

	public void setEquipamentStatus(int equipamentStatus) {
		this.equipamentStatus = equipamentStatus;
	}
	
	

}
