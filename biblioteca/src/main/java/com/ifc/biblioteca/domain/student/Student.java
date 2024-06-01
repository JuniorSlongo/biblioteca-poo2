package com.ifc.biblioteca.domain.student;

import com.ifc.biblioteca.domain.user.User;
import com.ifc.biblioteca.domain.course.Course;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "student")
@Data
@NoArgsConstructor
public class Student extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String registration;

    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Course course;
    
}
