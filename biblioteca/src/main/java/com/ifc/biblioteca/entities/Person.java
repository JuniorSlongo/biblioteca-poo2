package com.ifc.biblioteca.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Person {
     @Id
    private String cpf;

    private String name;
    private String password;
    private Date birthDate;

    @OneToOne
    @JoinColumn(name = "id_email")
    private Email email;

    @OneToOne(mappedBy = "person")
    private User user;

    // Getters and Setters
}
