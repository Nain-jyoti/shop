package com.example.shoppingverse.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "seller")

public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(unique = true, nullable = false)
    String emailId;

    @Column(unique = true, nullable = false)
    String mobileNo;

    @OneToMany(mappedBy = "seller", cascade = CascadeType.ALL)
    List<Product> product = new ArrayList<>();
}
