package com.ifc.biblioteca.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class User extends Person {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private long id;

    @OneToOne(mappedBy = "user")
    private Student student;

    @OneToOne(mappedBy = "user")
    private Teacher teacher;

    @OneToOne(mappedBy = "user")
    private List<Loan> loans;

}
