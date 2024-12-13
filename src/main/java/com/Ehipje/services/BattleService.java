package com.Ehipje.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ehipje.dtos.BattleDto;
import com.Ehipje.models.Battle;
import com.Ehipje.repositories.BattleRepository;

@Service
public class BattleService {

	@Autowired
	BattleRepository battleRepository;
	
	@Autowired
	UserService userService;
	
	public List<Battle> findAll(){
		return battleRepository.findAll();
	}
	public Battle findById(UUID id) {
		return battleRepository.findById(id).orElseThrow(() -> new RuntimeException("Cannot be found"));
	}
	
	public Battle createBattle(BattleDto battleDto) {
		var battle = new Battle();
		BeanUtils.copyProperties(battleDto, battle);
		return battleRepository.save(battle);
	}
	
	public Battle setResult(UUID id, int win) {
		var battle = findById(id);
		if(win == 1) {
			battle.setWinner(battle.getCaracter1());
			battle.setLoser(battle.getCaracter2());
			 
		}
		else if(win == 2) {
			battle.setWinner(battle.getCaracter2());
			battle.setLoser(battle.getCaracter1());

		}
		return battleRepository.save(battle);
	}
}
