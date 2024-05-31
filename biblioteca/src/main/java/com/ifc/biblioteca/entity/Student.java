package com.ifc.biblioteca.entity;

import jakarta.persistence.*;

@Entity
public class Student extends User {
    private String registration;
    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Course course;
    
    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

}
