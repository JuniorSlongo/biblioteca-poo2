package com.ifc.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ifc.biblioteca.entity.student.Student;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {}