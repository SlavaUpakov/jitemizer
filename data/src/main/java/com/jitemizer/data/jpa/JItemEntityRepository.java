package com.jitemizer.data.jpa;

import org.springframework.data.repository.CrudRepository;

import com.jitemizer.data.jpa.entity.JItemEntity;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface JItemEntityRepository extends CrudRepository<JItemEntity, Long> {

}