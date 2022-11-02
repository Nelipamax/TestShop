package com.nelipamax.testshop.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cart")
@Getter
@Setter
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    long id;
    @Column(name = "customer_id")
    long customerId;

    public Cart(long customerId, List<Product> productList) {
        this.customerId = customerId;
    }

    public Cart() {

    }
}
