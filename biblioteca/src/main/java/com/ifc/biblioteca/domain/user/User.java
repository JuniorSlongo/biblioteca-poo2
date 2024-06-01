package com.ifc.biblioteca.domain.user;

import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.ifc.biblioteca.domain.person.Person;

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
