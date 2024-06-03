package com.ifc.biblioteca.entity;



import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "administrator")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Administrator extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
}
