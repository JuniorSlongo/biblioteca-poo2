package com.ifc.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ifc.biblioteca.domain.teacher.Teacher;

import java.util.Optional;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, String> {}
