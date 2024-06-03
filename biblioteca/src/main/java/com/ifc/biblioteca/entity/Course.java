package com.ifc.biblioteca.entity;

import jakarta.persistence.*;
import java.util.List;


import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "course")
@Data
@NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int duration;
    
    @OneToMany(mappedBy = "course")
    private List<Student> students;

}
