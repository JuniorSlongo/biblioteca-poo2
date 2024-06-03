package com.ifc.biblioteca.entity;



import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "administrator")
@AllArgsConstructor
@NoArgsConstructor
public class Administrator extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
