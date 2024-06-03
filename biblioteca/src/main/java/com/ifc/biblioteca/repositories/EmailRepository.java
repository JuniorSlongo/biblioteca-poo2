package com.ifc.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ifc.biblioteca.entity.Email;


@Repository
public interface EmailRepository extends JpaRepository<Email, Long> {}