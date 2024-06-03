package com.ifc.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ifc.biblioteca.domain.loan.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, String> {}