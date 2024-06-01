package com.ifc.biblioteca.entity;

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
    private long id;

    private String registration;

    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Course course;
    
    @OneToOne
    @JoinColumn(name = "id_user")
    private User user;
}
