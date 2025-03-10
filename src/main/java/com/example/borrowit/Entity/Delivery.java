package com.example.borrowit.Entity;

import jakarta.persistence.*;

import java.util.Set;

public class Delivery {
@GeneratedValue
@Id
    private int id;
@OneToOne
    private Request request;
@OneToMany
    private Set<Reclamation> reclamations;
}

