package com.ifc.biblioteca.service;

import com.ifc.biblioteca.entity.User;
import com.ifc.biblioteca.repositories.UserRepository;

import com.ifc.biblioteca.entity.Email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User register(User user) {
        // Implementação do método de registro
        return userRepository.save(user);
    }

    public User login(String cpf, String password) {
        // Implementação do método de login
        Optional<User> userOpt = userRepository.findByCpfAndPassword(cpf, password);
        return userOpt.orElse(null);
    }

    public User findUserByEmail(Email email){
      
        Optional<User> userOpt = userRepository.findByEmail(email);
        return userOpt.orElse(null);
    }

    public Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }
}
