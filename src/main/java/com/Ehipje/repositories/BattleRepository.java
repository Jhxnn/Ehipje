package com.Ehipje.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ehipje.models.Battle;

public interface BattleRepository extends JpaRepository<Battle, UUID>{

}
