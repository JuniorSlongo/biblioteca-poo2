package com.ifc.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ifc.biblioteca.entity.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

  Optional<User> findByCpf(String cpf);
  Optional<User> findByCpfAndPassword(String cpf, String password);
  Optional<User> findByEmail(String email);
}