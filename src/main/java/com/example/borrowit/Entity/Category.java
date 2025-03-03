package com.example.borrowit.Entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;

@Entity
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Lob
    private byte[] image;

    private String name;
    private String description;

    @OneToMany(mappedBy = "category")
    private Set<Item> items;
public enum CategoryType {
        ELECTRONICS, FURNITURE, CLOTHING, BOOKS, OTHER
    }
}
