package com.Ehipje.models;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "caracters")
public class Caracter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private UUID caracterId;
	
	private String name;
	
	private int hp;
	
	private int strength;
	
	private int magic;
	
	@JoinColumn(referencedColumnName = "id", name = "equipament_id")
	private Equipament equipament;
	
	@JoinColumn(referencedColumnName = "id", name = "skill_id")
	private List<Skill> skill;
	
	@JoinColumn(referencedColumnName = "id", name = "item_id")
	private List<Item> inventory;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getMagic() {
		return magic;
	}

	public void setMagic(int magic) {
		this.magic = magic;
	}

	public Equipament getEquipament() {
		return equipament;
	}

	public void setEquipament(Equipament equipament) {
		this.equipament = equipament;
	}

	public List<Skill> getSkill() {
		return skill;
	}

	public void setSkill(List<Skill> skill) {
		this.skill = skill;
	}

	public List<Item> getInventory() {
		return inventory;
	}

	public void setInventory(List<Item> inventory) {
		this.inventory = inventory;
	}

	public UUID getCaracterId() {
		return caracterId;
	}

	public void setCaracterId(UUID caracterId) {
		this.caracterId = caracterId;
	}
	
	

}
