package com.Ehipje.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ehipje.dtos.CaracterDto;
import com.Ehipje.models.Caracter;
import com.Ehipje.services.CaracterService;

@RestController
@RequestMapping("/caracter")
public class CaracterController {

	
	@Autowired
	CaracterService caracterService;
	
	
	@GetMapping
	public ResponseEntity<List<Caracter>> findAll(){
		return ResponseEntity.status(HttpStatus.OK).body(caracterService.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Caracter> findById(@PathVariable(name = "id")UUID id){
		return ResponseEntity.status(HttpStatus.OK).body(caracterService.findById(id));
	}
	
	@PostMapping
	public ResponseEntity<Caracter> createCaracter(@RequestBody CaracterDto caracterDto){
		return ResponseEntity.status(HttpStatus.CREATED).body(caracterService.createCaracter(caracterDto));
	}
	
}
