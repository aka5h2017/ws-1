package com.akash.kvpoc.ws1.rest;

import com.akash.kvpoc.ws1.model.Greeting;
import com.akash.kvpoc.ws1.repository.GreetingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/greeting", produces = "application/json")
public class GreetingController {
    
    @Autowired
    GreetingRepository greetingRepository;

    @RequestMapping(path = "/all")
    public Greeting getGreeting() {

        Greeting greeting = greetingRepository.findAll().iterator().next();

        return greeting;
    }
    

    
    }

