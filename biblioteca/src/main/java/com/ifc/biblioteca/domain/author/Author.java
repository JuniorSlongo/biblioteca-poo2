package com.ifc.biblioteca.domain.author;

import com.ifc.biblioteca.domain.book.Book;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "author")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;
    private Date birthDate;
    private String biography;
    
    @OneToMany(mappedBy = "author")
    private List<Book> books;

}
