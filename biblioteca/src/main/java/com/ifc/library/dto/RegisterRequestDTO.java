package com.ifc.library.dto;

import java.util.Date;

public record RegisterRequestDTO (String name, String email, String password, String cpf, Date birthDate, String registration, String departament, String type) {}