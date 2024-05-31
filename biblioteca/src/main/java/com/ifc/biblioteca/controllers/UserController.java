package com.ifc.biblioteca.controllers;

import com.ifc.biblioteca.entities.User;
import com.ifc.biblioteca.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/registrar")
    public ResponseEntity<User> registrar(@RequestBody User user) {
        userService.registrar(user);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestParam String cpf, @RequestParam String senha) {
        User user = userService.login(cpf, senha);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }
}
