package com.nelipamax.testshop.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "customer")
@Setter
@Getter
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;

    public Customer(String username, String password, String email, Cart cart) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public Customer () {}
}
