package com.ifc.biblioteca.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmail;

    private String email;

    public boolean validateEmail(String email) {
        // Implement email validation logic
        return email.contains("@");
    }

    // Getters and Setters
}
