package com.ifc.biblioteca.entity;



import jakarta.persistence.*;

import lombok.NoArgsConstructor;

@Entity
@Table(name = "student")
@NoArgsConstructor
public class Student extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String registration;

    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Course course;
    
}
