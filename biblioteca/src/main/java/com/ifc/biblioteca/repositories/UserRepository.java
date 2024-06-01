package com.ifc.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ifc.biblioteca.domain.user.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

  Optional<User> findByCpf(String cpf);
  Optional<User> findByCpfAndPassword(String cpf, String password);
}