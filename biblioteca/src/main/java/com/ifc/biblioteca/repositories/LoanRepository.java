package com.ifc.biblioteca.repositories;

import com.ifc.biblioteca.entities.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Integer> {}