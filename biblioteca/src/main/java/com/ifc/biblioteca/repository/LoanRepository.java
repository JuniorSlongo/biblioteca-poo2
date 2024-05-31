package com.ifc.biblioteca.repository;

import com.ifc.biblioteca.entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface LoanRepository extends JpaRepository<Loan, Integer> {}