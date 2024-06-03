package com.ifc.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ifc.biblioteca.domain.user.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

  Optional<User> findByCpf(String cpf);
  Optional<User> findByCpfAndPassword(String cpf, String password);
}