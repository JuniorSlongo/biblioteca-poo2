package com.ifc.biblioteca.entity;

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
    private Long id;

    private String email;

    @ManyToOne
    @JoinColumn(name = "idPerson")
    private Person person;
}
