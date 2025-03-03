package com.example.borrowit.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Reacts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Reaction reaction;

    private Date date;

    @ManyToOne
    private User user;


    @ManyToOne
    private Feedback feedback;

    public enum Reaction {
        LIKE, DISLIKE, LOVE, LAUGH, SAD, ANGRY
    }
}
