package com.ifc.biblioteca.domain.book;

import com.ifc.biblioteca.domain.author.Author;
import com.ifc.biblioteca.domain.loan.Loan;

import jakarta.persistence.*;
import java.util.List;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "book")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String title;

    @ManyToOne
    @JoinColumn(name = "id_author")
    private Author author;

    private String isbn;
    private boolean availability;

    @OneToMany(mappedBy = "book")
    private List<Loan> loans;
    
}
