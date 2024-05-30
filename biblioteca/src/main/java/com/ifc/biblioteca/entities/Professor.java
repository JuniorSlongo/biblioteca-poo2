package com.ifc.biblioteca.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
@Entity
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProfessor;

    private String department;

    @OneToOne
    @JoinColumn(name = "id_user")
    private User user;

    // Getters and Setters
}
