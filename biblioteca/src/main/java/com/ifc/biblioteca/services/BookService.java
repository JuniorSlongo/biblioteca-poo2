package com.ifc.biblioteca.services;

import com.ifc.biblioteca.entities.Book;
import com.ifc.biblioteca.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public void register(Book book) {
        // Implementação do método de registro
        bookRepository.save(book);
    }

    public Book search(String title) {
        // Implementação do método de busca
        return bookRepository.findByTitle(title);
    }
}