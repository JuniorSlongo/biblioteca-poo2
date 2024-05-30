package com.ifc.biblioteca.services;

import com.ifc.biblioteca.entities.User;
import com.ifc.biblioteca.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void registrar(User user) {
        // Implementação do método de registro
        userRepository.save(user);
    }

    public User login(String cpf, String senha) {
        // Implementação do método de login
        return userRepository.findByCpfAndSenha(cpf, senha);
    }
}
