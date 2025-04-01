package com.example.server.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;

    public void setUserName(String userName){
        this.username =  username;
    }
    public String getUsername(){
        return username;
    }

    public void setPassword( String password){
        this.password =  password;
    }

    public  String getPassword(){
        return password;
    }
}
