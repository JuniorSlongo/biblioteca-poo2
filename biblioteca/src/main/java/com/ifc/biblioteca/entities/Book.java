package com.ifc.biblioteca.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBook;

    private String title;
    private String isbn;
    private boolean availability;

    @ManyToOne
    @JoinColumn(name = "id_author")
    private Author author;

    @OneToMany(mappedBy = "book")
    private List<Loan> loans;

    public List<Book> search() {
        // Implement book search logic
        return null;
    }

    // Getters and Setters
}
