package com.example.borrowit.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private String terms;

    @ManyToOne
    private User borrower;

    @ManyToOne
    private User owner;

    @OneToOne
    private Payment payment;
}
