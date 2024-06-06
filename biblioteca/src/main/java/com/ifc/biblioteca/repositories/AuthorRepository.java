package com.ifc.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ifc.biblioteca.entity.Author;
import java.util.Optional;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
