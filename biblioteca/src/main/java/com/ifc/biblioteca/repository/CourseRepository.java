package com.ifc.biblioteca.repository;

import com.ifc.biblioteca.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CourseRepository extends JpaRepository<Course, Integer> {}