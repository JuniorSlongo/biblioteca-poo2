package com.ifc.biblioteca.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    // @RequestMapping("/login")
    // public String login() {
    //     return "login";
    // }

    // @RequestMapping("/cadastro")
    // public String cadastro() {
    //     return "cadastro";
    // }

    // @RequestMapping("/livros")
    // public String livros() {
    //     return "livros";
    // }

    // @RequestMapping("/autores")
    // public String emprestimos() {
    //     return "emprestimos";
    // }

    // @RequestMapping("/usuarios")
    // public String usuarios() {
    //     return "usuarios";
    // }
}
