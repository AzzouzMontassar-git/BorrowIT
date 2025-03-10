package com.example.borrowit.Entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private RequestStatus status;

    private LocalDateTime requestDate;

    @ManyToOne
    private User borrower;

    @ManyToOne
    private Item item;
    @OneToOne
    private Discount discount;

public enum RequestStatus {
        PENDING, ACCEPTED, REJECTED
    }
}
