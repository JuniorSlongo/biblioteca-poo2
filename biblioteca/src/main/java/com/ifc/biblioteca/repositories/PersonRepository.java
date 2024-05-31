package com.ifc.biblioteca.repositories;

import com.ifc.biblioteca.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, String> {}