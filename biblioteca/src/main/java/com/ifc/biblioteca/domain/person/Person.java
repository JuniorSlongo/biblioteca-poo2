package com.ifc.biblioteca.domain.person;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

import com.ifc.biblioteca.domain.email.Email;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "person")
@Data
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String cpf;
    private String name;
    private String password;
    private Date birthDate;
    
    @OneToMany
    @JoinColumn(name = "idEmail")
    private List<Email> emails;
    
}
