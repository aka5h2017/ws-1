package com.akash.kvpoc.ws1.repository;

import com.akash.kvpoc.ws1.model.Greeting;

import org.springframework.data.repository.CrudRepository;

public interface GreetingRepository extends CrudRepository<Greeting, Long> {

}