package com.Ehipje.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ehipje.models.User;

public interface UserRepository extends JpaRepository<User, UUID>{

}
