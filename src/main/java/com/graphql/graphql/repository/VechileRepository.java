package com.graphql.graphql.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.graphql.graphql.entity.Vechile;

public interface VechileRepository extends MongoRepository<Vechile, String>{

}
