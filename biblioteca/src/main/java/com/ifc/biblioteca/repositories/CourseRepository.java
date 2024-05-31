package com.ifc.biblioteca.repositories;

import com.ifc.biblioteca.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {}