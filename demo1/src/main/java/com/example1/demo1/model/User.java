package com.example1.demo1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; //la base de datos\

    @Column
    private String username; // Logeo
    @Column
    private String password; // Logeo
    @Column
    private String name; // informacion extra 
    @Column
    private String color; // informacion extra 
}
