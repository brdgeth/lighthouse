package com.hackathon.lighthouse.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.hackathon.lighthouse.documents.TechCategory;

public interface CategoryRepository extends MongoRepository<TechCategory, ObjectId> {}
