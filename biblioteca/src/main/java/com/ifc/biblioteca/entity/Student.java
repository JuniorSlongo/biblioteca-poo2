package com.ifc.biblioteca.entity.student;

import com.ifc.biblioteca.entity.user.User;

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
