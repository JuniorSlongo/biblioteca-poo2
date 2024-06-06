package com.ifc.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ifc.biblioteca.entity.Person;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
