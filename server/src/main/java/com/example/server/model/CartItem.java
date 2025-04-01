package com.example.server.model;


import jakarta.persistence.*;

@Entity
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String productName;
    private int quantity;
    private Double price;

    @ManyToOne
    private Cart cart;
}
