package com.example.demo.ghost;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.ghost.Ghost;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface GhostRepository extends CrudRepository<Ghost, Integer> {

}