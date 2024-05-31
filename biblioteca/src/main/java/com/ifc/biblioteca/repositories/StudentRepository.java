package com.ifc.biblioteca.repositories;

import com.ifc.biblioteca.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {}
