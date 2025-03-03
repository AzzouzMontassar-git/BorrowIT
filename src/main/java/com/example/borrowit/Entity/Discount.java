package com.example.borrowit.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Discount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Name name;

    private float percentage;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    @ManyToOne
    private Item item;

    public enum Name {
        BLACK_FRIDAY, VALENTINES_DAY, ANNIVERSARY, SPECIAL
    }
}
