package com.ifc.biblioteca.entities;

import jakarta.persistence.*;

@Entity
public class Professor extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProfessor;
    private String departamento;
    
    public int getIdProfessor() {
        return idProfessor;
    }
    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // Getters e setters
}
