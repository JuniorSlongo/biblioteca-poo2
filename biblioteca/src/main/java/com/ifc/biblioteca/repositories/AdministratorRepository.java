package com.ifc.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ifc.biblioteca.domain.administrator.Administrator;

import java.util.Optional;

@Repository
public interface AdministratorRepository extends JpaRepository<Administrator, String> {}