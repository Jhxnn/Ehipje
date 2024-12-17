package com.Ehipje.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ehipje.dtos.BattleDto;
import com.Ehipje.models.Battle;
import com.Ehipje.services.BattleService;

@RestController
@RequestMapping("/battle")
public class BattleController {

	
	@Autowired
	BattleService battleService;
	
	@GetMapping
	public ResponseEntity<List<Battle>> findAll(){
		return ResponseEntity.status(HttpStatus.OK).body(battleService.findAll());
	}
	@GetMapping("/{id}")
	public ResponseEntity<Battle> findById(@PathVariable(name = "id")UUID id){
		return ResponseEntity.status(HttpStatus.OK).body(battleService.findById(id));
	}
	@PostMapping
	public ResponseEntity<Battle> createBattle(@RequestBody BattleDto battleDto){
		return ResponseEntity.status(HttpStatus.CREATED).body(battleService.createBattle(battleDto));
	}
	@PutMapping("/{id}/{caracterWinnerNumber}")
	public ResponseEntity<Battle> setResult(@PathVariable(name = "id")UUID id, @PathVariable(name = "number")int number){
		return ResponseEntity.status(HttpStatus.CREATED).body(battleService.setResult(id, number));
	}
}
