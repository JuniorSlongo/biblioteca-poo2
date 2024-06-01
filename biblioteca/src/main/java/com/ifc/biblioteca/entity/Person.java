package com.ifc.biblioteca.entity;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "person")
@Data
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private long id;

    private String cpf;
    private String name;
    private String password;
    private Date birthDate;
    
    @OneToMany
    @JoinColumn(name = "idEmail")
    private List<Email> emails;
    
}
