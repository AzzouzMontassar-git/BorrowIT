package com.example.borrowit.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private float amount;

    private LocalDateTime date;

    @Enumerated(EnumType.STRING)
    private PaymentStatus status;

    @OneToOne
    @JoinColumn(name = "contract_id")
    @JsonIgnore
    private Contract contract;

    public enum PaymentStatus {
        PENDING, COMPLETED, FAILED
    }
}
