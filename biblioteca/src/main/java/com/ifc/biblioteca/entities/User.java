package com.ifc.biblioteca.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;

    @OneToOne
    @JoinColumn(name = "cpf")
    private Person person;

    @OneToOne(mappedBy = "user")
    private Student student;

    @OneToOne(mappedBy = "user")
    private Professor professor;

    public void register(String cpf, String name, String password, Date birthDate) {
        // Implement registration logic
    }

    public void login(String cpf, String password) {
        // Implement login logic
    }

    // Getters and Setters
}
