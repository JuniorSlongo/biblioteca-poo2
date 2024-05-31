package com.ifc.biblioteca.repository;

import com.ifc.biblioteca.entity.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministratorRepository extends JpaRepository<Administrator, Integer> {}