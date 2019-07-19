package com.example.desafiodropbox.models;

import java.util.Date;

public class User {

    private String name;
    private String document;
    private Integer birthDate;
    private String profession;

    public User(String name, String document, Integer birthDate, String profession) {
        this.name = name;
        this.document = document;
        this.birthDate = birthDate;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public String getDocument() {
        return document;
    }

    public Integer getBirthDate() {
        return birthDate;
    }

    public String getProfession() {
        return profession;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public void setBirthDate(Integer birthDate) {
        this.birthDate = birthDate;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
