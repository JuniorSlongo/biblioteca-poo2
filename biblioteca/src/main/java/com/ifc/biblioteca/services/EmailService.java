package com.ifc.biblioteca.services;

import com.ifc.biblioteca.entities.Email;
import com.ifc.biblioteca.repositories.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    @Autowired
    private EmailRepository emailRepository;

    public void enviar(Email email) {
        // Implementação do método de envio de e-mail
        emailRepository.save(email);
    }
}