package com.ifc.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ifc.biblioteca.domain.book.Book;

import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {

    Optional<Book> findByTitle(String title);
}