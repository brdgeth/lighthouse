package com.hackathon.lighthouse.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.hackathon.lighthouse.documents.TechItem;

public interface ItemRepository extends MongoRepository<TechItem, ObjectId> {}
