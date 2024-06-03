package com.ifc.biblioteca.entity;

import jakarta.persistence.*;
import java.util.List;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "course")
@Data
@Getter
@Setter
@NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;
    private int duration;
    
    @OneToMany(mappedBy = "course")
    private List<Student> students;

}
