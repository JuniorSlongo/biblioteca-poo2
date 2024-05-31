package com.ifc.biblioteca.repository;

import com.ifc.biblioteca.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface StudentRepository extends JpaRepository<Student, Integer> {}
