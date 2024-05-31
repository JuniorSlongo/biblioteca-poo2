package com.ifc.biblioteca.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User extends Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

}
