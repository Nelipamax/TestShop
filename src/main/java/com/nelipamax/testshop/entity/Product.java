package com.nelipamax.testshop.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "product")
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(name = "description")
    private String description;
    @Column(name = "name")
    private String name;

    public Product(String description, String name) {
        this.description = description;
        this.name = name;
    }

    public Product () {

    }
}
