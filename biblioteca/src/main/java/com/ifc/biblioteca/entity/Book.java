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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String isbn;
    private boolean availability;

    @ManyToOne
    @JoinColumn(name = "id_author")
    private Author author;

    @OneToMany(mappedBy = "book")
    private List<Loan> loans;
    
}
