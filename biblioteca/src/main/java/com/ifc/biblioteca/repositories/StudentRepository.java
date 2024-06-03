package com.ifc.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ifc.biblioteca.entity.Student;



@Repository
public interface StudentRepository extends JpaRepository<Student, String> {}
