package com.ifc.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ifc.biblioteca.domain.course.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {}