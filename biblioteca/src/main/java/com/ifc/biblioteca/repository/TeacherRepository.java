package com.ifc.biblioteca.repository;

import com.ifc.biblioteca.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {}
