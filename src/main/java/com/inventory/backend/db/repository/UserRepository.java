package com.inventory.backend.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventory.backend.db.model.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {

}
