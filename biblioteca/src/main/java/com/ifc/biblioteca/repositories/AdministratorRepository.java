package com.ifc.biblioteca.repositories;

import com.ifc.biblioteca.entities.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministratorRepository extends JpaRepository<Administrator, Integer> {}