package com.ifc.biblioteca.repositories;

import com.ifc.biblioteca.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

  Optional<User> findByCpel(String cpf);
  Optional<User> findByCpfAndPassword(String cpf, String password);
}