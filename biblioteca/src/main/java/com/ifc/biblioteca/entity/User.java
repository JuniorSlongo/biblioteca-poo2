package com.ifc.biblioteca.entity;



import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class User extends Person {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

}
