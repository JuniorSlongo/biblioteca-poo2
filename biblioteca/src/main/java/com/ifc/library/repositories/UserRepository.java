package com.ifc.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ifc.library.entity.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    Optional<User> findByCpf(String cpf);

    Optional<User> findByCpfAndPassword(String cpf, String password);

    Optional<User> findByEmail(String email);
}
