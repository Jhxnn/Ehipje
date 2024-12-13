package com.Ehipje.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ehipje.dtos.SkillDto;
import com.Ehipje.models.Skill;
import com.Ehipje.repositories.SkillRepository;

@Service
public class SkillService {

	
	@Autowired
	SkillRepository skillRepository;
	
	public List<Skill> findAll(){
		return skillRepository.findAll();
	}
	
	public Skill findById(UUID id) {
		return skillRepository.findById(id).orElseThrow(() -> new RuntimeException("Cannot be found"));
	}
	
	public Skill createSkill(SkillDto skillDto) {
		var skill = new Skill();
		BeanUtils.copyProperties(skillDto, skill);
		return skillRepository.save(skill);
	}
	
	
}
