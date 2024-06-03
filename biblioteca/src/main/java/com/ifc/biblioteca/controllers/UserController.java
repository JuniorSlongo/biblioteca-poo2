package com.ifc.biblioteca.controllers;

import com.ifc.biblioteca.entity.User;
import com.ifc.biblioteca.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.register(user);
    }
    
    @GetMapping
    public Iterable <User>getAllUsers(@RequestParam UserService user) {
        return userService.getAllUsers();
    }
    
    




    // @PostMapping("/register")
    // public ResponseEntity<User> registrar(@RequestBody UserRegister userRegister) {
    //     User user = new User();
    //     user.setCpf(userRegister.getCpf());
    //     user.setPassword(userRegister.getPassword());
    //     user.setName(userRegister.getName());
    //     user.setBirthDate(userRegister.getBirthDate());
    //     // user.setEmail(new Email(userRegister.getEmail()));
    //     userService.register(user);
    //     return ResponseEntity.ok(user);
    // }

    // @PostMapping("/login")
    // public ResponseEntity<User> login(@RequestBody UserLogin userLogin) {
    //     User user = userService.login(userLogin.getCpf(), userLogin.getPassword());
    //     if (user != null) {
    //         return ResponseEntity.ok(user);
    //     } else {
    //         return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    //     }
    // }
}
