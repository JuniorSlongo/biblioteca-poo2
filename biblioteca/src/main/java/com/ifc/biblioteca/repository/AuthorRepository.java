package com.ifc.biblioteca.repository;

import com.ifc.biblioteca.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {}
