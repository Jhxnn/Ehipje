package com.Ehipje.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ehipje.models.Item;

public interface ItemRepository extends JpaRepository<Item, UUID>{

}
