package com.ifc.biblioteca.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
@Entity
public class Administrator extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAdministrator;

    @OneToOne
    @JoinColumn(name = "id_user")
    private User user;

    public void addBook(Book book) {
        // Implement add book logic
    }

    public void removeBook(Book book) {
        // Implement remove book logic
    }

    public void manageUsers(User user) {
        // Implement user management logic
    }

    // Getters and Setters
}
