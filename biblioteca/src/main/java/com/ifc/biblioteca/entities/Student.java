package com.ifc.biblioteca.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
@Entity
public class Student {
    @Id
    private String registrationNumber;

    @ManyToOne
    @JoinColumn(name = "id_course")
    private Course course;

    @OneToOne
    @JoinColumn(name = "id_user")
    private User user;

    // Getters and Setters
}
