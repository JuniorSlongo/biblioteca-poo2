package com.ifc.library.entity;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@Entity
@Table(name = "teacher")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Teacher extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String departament;
    
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;    
}
