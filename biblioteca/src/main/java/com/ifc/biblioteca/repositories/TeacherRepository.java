package com.ifc.biblioteca.repositories;

import com.ifc.biblioteca.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {}
