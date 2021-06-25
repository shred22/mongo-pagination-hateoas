package com.spboot.mongo.pagination.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spboot.mongo.pagination.entity.BulkData;

public interface BulkDataRepo extends MongoRepository<BulkData, Integer> {
}
