package com.jitemizer.data.mongo;

import com.jitemizer.domains.JItem;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface JItemMongoRepository extends MongoRepository<JItem, String> {
    public JItem findByName(String name);
}
