package com.Ehipje.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ehipje.models.Skill;

public interface SkillRepository extends JpaRepository<Skill, UUID> {

}
