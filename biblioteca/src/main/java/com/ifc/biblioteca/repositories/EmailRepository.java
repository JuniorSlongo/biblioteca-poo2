package com.ifc.biblioteca.repositories;

import com.ifc.biblioteca.entities.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<Email, Integer> {}