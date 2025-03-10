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

   @OneToMany
   private Set<Feedback> feedbacks;



}
