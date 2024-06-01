package com.ifc.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ifc.biblioteca.domain.teacher.Teacher;

import java.util.Optional;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {}
