package com.ifc.biblioteca.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCourse;

    private String name;
    private int duration;

    @OneToMany(mappedBy = "course")
    private List<Student> students;

    public void register(String name, int duration) {
        // Implement course registration logic
    }

    public List<Course> search() {
        // Implement course search logic
        return null;
    }

    // Getters and Setters
}
