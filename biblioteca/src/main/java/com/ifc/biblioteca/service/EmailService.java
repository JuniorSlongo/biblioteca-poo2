package com.ifc.biblioteca.service;

import com.ifc.biblioteca.entity.Email;
import com.ifc.biblioteca.repository.EmailRepository;
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