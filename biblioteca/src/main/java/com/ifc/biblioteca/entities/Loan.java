package com.ifc.biblioteca.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLoan;

    private Date loanDate;
    private Date returnDate;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_book")
    private Book book;

    public void loan(int userId, int bookId) {
        // Implement loan logic
    }

    public void returnBook(int userId, int bookId) {
        // Implement return logic
    }

    // Getters and Setters
}
