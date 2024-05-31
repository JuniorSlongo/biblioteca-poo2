package com.ifc.biblioteca.entities;

import jakarta.persistence.*;

@Entity
public class Administrator extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAdministrador;

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    
}
