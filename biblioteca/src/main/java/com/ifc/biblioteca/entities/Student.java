package com.ifc.biblioteca.entities;

import javax.persistence.*;

@Entity
public class Student extends User {
    private String matricula;
    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Course curso;
    
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public Course getCurso() {
        return curso;
    }
    public void setCurso(Course curso) {
        this.curso = curso;
    }

    // Getters e setters
}
