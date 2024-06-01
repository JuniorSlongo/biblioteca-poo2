package com.ifc.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ifc.biblioteca.domain.student.Student;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Integer> {}
