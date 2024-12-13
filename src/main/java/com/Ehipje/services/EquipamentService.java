package com.Ehipje.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ehipje.dtos.EquipamentDto;
import com.Ehipje.models.Equipament;
import com.Ehipje.repositories.EquipamentRepository;

@Service
public class EquipamentService {

	
	
	@Autowired
	EquipamentRepository equipamentRepository;
	
	public List<Equipament> findAll() {
		return equipamentRepository.findAll();
	}
	
	public Equipament findById(UUID id) {
		return equipamentRepository.findById(id).orElseThrow(() -> new RuntimeException("Cannot be found"));
	}
	
	public Equipament createEquipament(EquipamentDto equipDto) {
		
		var equipament = new Equipament();
		BeanUtils.copyProperties(equipDto, equipament);
		
		return equipamentRepository.save(equipament);
	}
} 
