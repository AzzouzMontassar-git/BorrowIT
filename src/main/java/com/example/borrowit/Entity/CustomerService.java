package com.example.borrowit.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class CustomerService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String issueDescription;

    @Enumerated(EnumType.STRING)
    private ServiceStatus status;

    @ManyToOne
    private User user;

public enum ServiceStatus {
        OPEN, IN_PROGRESS, RESOLVED
    }
}
