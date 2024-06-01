package com.ifc.biblioteca.entity;

import jakarta.persistence.*;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "book")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private int idBook;
    private String title;
    @ManyToOne
    @JoinColumn(name = "id_author")
    private Author author;
    private String isbn;
    private boolean availability;

    @OneToMany(mappedBy = "book")
    private List<Loan> loans;

    public List<Loan> getLoans() {
        return loans;
    }

    public void setLoans(List<Loan> loans) {
        this.loans = loans;
    }
    
}
