package com.ifc.biblioteca.repository;

import com.ifc.biblioteca.entity.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EmailRepository extends JpaRepository<Email, Integer> {}