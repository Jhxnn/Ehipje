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

import com.Ehipje.dtos.ItemDto;
import com.Ehipje.models.Item;
import com.Ehipje.services.ItemService;
@RestController
@RequestMapping("/item")
public class ItemController {
	
	@Autowired
	ItemService itemService;
	
	
	@GetMapping
	public ResponseEntity<List<Item>> findAll(){
		return ResponseEntity.status(HttpStatus.OK).body(itemService.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Item> findById(@PathVariable(name = "id")UUID id){
		return ResponseEntity.status(HttpStatus.OK).body(itemService.findById(id));
	}
	
	@PostMapping
	public ResponseEntity<Item> createItem(@RequestBody ItemDto itemDto){
		return ResponseEntity.status(HttpStatus.CREATED).body(itemService.createItem(itemDto));
	}
	
}
