package com.akash.kvpoc.ws1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Greeting {
    
@Id    
private Long id;

@Column(name = "greeting_msg")
private String message;

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getMessage() {
    return message;
}

public void setMessage(String message) {
    this.message = message;
}

}