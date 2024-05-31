package com.ifc.biblioteca.repositories;

import com.ifc.biblioteca.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

  public findByTitle(String title){

    

  }

}