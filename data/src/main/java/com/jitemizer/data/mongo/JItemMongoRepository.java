package com.jitemizer.data.repository;

import com.jitemizer.domains.JItem;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JItemMongoRepository extends MongoRepository<JItem, String> {
    public JItem findByName(String name);
}