package com.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mongo.entity.Customer;



@Repository
public interface CustomerRepository extends MongoRepository<Customer, Integer>{

}
