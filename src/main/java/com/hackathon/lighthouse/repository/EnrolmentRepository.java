package com.hackathon.lighthouse.repository;

import java.util.Collection;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.hackathon.lighthouse.documents.Enrolment;

public interface EnrolmentRepository extends MongoRepository<Enrolment, ObjectId> {

	Collection<Enrolment> findByAccountId(String accountId);

}
