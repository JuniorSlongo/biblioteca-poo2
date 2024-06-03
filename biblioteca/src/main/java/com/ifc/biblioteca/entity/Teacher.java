package com.ifc.biblioteca.entity;

import com.ifc.biblioteca.entity.User;

import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "teacher")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String departament;
}
