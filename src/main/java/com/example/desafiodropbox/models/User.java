package com.example.desafiodropbox.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User")
public class User {

    @Id
    private int id;
    private String name;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
