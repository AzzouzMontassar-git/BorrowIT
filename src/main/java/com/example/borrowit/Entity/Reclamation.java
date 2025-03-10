package com.example.borrowit.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.Set;

public class Reclamation {
    @GeneratedValue
    @Id
    private int id;
    @ManyToOne
    private Set<Delivery> deliveries;
}
