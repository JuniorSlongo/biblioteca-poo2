package com.ifc.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ifc.biblioteca.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, String> {}