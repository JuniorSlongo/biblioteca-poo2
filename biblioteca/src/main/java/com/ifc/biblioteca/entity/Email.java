package com.ifc.biblioteca.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "email")
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmail;
    private String email;

    public boolean validarEmail(String email) {
        // Implementação da lógica de validação do email
        if (email == null) {
            return false;
        }
        return true; // exemplo simples, deve ser ajustado para validar corretamente
    }

    public int getIdEmail() {
        return idEmail;
    }

    public void setIdEmail(int idEmail) {
        this.idEmail = idEmail;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
