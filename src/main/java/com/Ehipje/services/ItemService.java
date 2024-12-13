package com.Ehipje.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ehipje.dtos.ItemDto;
import com.Ehipje.models.Item;
import com.Ehipje.repositories.ItemRepository;

@Service
public class ItemService {

	
	@Autowired
	ItemRepository itemRepository;
	
	public List<Item> findAll(){
		return itemRepository.findAll();
	}
	
	public Item findById(UUID id) {
		return itemRepository.findById(id).orElseThrow(() -> new RuntimeException("Cannot be found"));
	}
	
	public Item createItem(ItemDto itemDto) {
		var item = new Item();
		BeanUtils.copyProperties(itemDto, item);
		return itemRepository.save(item);
	}
	
}
