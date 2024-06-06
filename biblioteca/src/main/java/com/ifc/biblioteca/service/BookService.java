package com.ifc.biblioteca.service;

import com.ifc.biblioteca.entity.Book;
import com.ifc.biblioteca.repositories.BookRepository;
import java.util.Optional;
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
        Optional<Book> bookOpt = bookRepository.findByTitle(title);
        return bookOpt.orElse(null);
    }
}