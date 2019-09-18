package com.example.desafiodropbox.repository;

import com.example.desafiodropbox.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Repository extends MongoRepository<User, Integer> {

}
