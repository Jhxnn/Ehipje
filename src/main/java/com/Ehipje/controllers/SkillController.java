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

import com.Ehipje.dtos.SkillDto;
import com.Ehipje.models.Skill;
import com.Ehipje.services.SkillService;


@RestController
@RequestMapping("/skill")
public class SkillController {

	@Autowired
	SkillService skillService;
	
	
	@GetMapping
	public ResponseEntity<List<Skill>> findAll(){
		return ResponseEntity.status(HttpStatus.OK).body(skillService.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Skill> findById(@PathVariable(name = "id")UUID id){
		return ResponseEntity.status(HttpStatus.OK).body(skillService.findById(id));
	}
	
	@PostMapping
	public ResponseEntity<Skill> createSkill(@RequestBody SkillDto skillDto){
		return ResponseEntity.status(HttpStatus.CREATED).body(skillService.createSkill(skillDto));
	}
}
