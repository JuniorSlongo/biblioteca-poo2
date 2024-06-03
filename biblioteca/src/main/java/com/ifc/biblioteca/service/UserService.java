package com.ifc.biblioteca.service;

import com.ifc.biblioteca.entity.user.User;
import com.ifc.biblioteca.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void register(User user) {
        // Implementação do método de registro
        userRepository.save(user);
    }

    public User login(String cpf, String password) {
        // Implementação do método de login
        Optional<User> userOpt = userRepository.findByCpfAndPassword(cpf, password);
        return userOpt.orElse(null);
    }
}
