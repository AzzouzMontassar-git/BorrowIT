package com.example.borrowit.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String itemCondition;
    private boolean availability;

    @ManyToOne
    private User owner;

    @ManyToOne
    private Category category;

    @OneToMany(mappedBy = "item")
    private Set<Review> reviews;

    @OneToMany(mappedBy = "item")
    private Set<Request> requests;

    @OneToMany(mappedBy = "item")
    private Set<Discount> discounts;

    @OneToMany(mappedBy = "item")
    private Set<Contract> contracts;
}
