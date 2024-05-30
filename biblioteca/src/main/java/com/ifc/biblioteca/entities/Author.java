package com.ifc.biblioteca.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public interface Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idAuthor;

    String name;
    Date birthDate;
    String biography;

    @OneToMany(mappedBy = "author")
    List<Book> books;

    public void register(String name, Date birthDate, String biography);

    // Getters and Setters
}
