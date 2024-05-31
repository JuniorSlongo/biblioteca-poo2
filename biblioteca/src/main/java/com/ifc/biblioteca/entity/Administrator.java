package com.ifc.biblioteca.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "administrator")
public class Administrator extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAdministrator;

    public long getIdAdministrador() {
        return idAdministrator;
    }

    public void setIdAdministrador(long idAdministrator) {
        this.idAdministrator = idAdministrator;
    }

    
}
