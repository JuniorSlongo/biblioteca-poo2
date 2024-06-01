package com.ifc.biblioteca.domain.email;

import com.ifc.biblioteca.domain.person.Person;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "email")
@Data
@NoArgsConstructor
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String email;

    @ManyToOne
    @JoinColumn(name = "idPerson")
    private Person person;
}
