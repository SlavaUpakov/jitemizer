package com.jitemizer.data.mongo;

import com.jitemizer.core.domain.JItem;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface JItemMongoRepository extends MongoRepository<JItem, String> {
    public JItem findByName(String name);
}
