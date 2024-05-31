package com.ifc.biblioteca.repository;

import com.ifc.biblioteca.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PersonRepository extends JpaRepository<Person, String> {}