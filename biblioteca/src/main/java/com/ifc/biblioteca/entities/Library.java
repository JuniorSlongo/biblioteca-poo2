package com.ifc.biblioteca.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
@Entity
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany
    @JoinColumn(name = "id_library")
    private List<Book> books;

    @OneToMany
    @JoinColumn(name = "id_library")
    private List<User> users;

    // Getters and Setters
}
