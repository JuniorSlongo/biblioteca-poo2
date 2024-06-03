package com.ifc.biblioteca.entity;

import jakarta.persistence.*;
import java.util.List;



import lombok.Data;
import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "book")
@Data
@Getter
@Setter
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
