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

import com.Ehipje.dtos.EquipamentDto;
import com.Ehipje.models.Equipament;
import com.Ehipje.services.EquipamentService;

@RestController
@RequestMapping("/equipament")
public class EquipamentController {
	
		
		@Autowired
		EquipamentService equipService;
		
		
		@GetMapping
		public ResponseEntity<List<Equipament>> findAll(){
			return ResponseEntity.status(HttpStatus.OK).body(equipService.findAll());
		}
		
		@GetMapping("/{id}")
		public ResponseEntity<Equipament> findById(@PathVariable(name = "id")UUID id){
			return ResponseEntity.status(HttpStatus.OK).body(equipService.findById(id));
		}
		
		@PostMapping
		public ResponseEntity<Equipament> createEquipament(@RequestBody EquipamentDto equipamentDto){
			return ResponseEntity.status(HttpStatus.CREATED).body(equipService.createEquipament(equipamentDto));
		}
		
}
