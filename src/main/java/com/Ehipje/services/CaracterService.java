package com.Ehipje.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ehipje.dtos.CaracterDto;
import com.Ehipje.dtos.UserDto;
import com.Ehipje.models.Caracter;
import com.Ehipje.repositories.CaracterRepository;

@Service
public class CaracterService {

	
	@Autowired
	CaracterRepository caracterRepository;
	
	
	public List<Caracter> findAll(){
		return caracterRepository.findAll();
	}
	
	public Caracter findById(UUID id) {
		return caracterRepository.findById(id).orElseThrow(() -> new RuntimeException("Cannot be found"));
	}
	
	public Caracter createCaracter(CaracterDto caracterDto) {
		var caracter = new Caracter();
		BeanUtils.copyProperties(caracterDto, caracter);
		return caracterRepository.save(caracter);
	}
	
}
