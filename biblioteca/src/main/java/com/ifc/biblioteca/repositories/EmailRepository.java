package com.ifc.biblioteca.repositories;

import com.ifc.biblioteca.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<Email, Integer> {}
public interface PersonRepository extends JpaRepository<Person, String> {}
public interface UserRepository extends JpaRepository<User, Integer> {}
public interface StudentRepository extends JpaRepository<Student, Integer> {}
public interface ProfessorRepository extends JpaRepository<Professor, Integer> {}
public interface CourseRepository extends JpaRepository<Course, Integer> {}
public interface AuthorRepository extends JpaRepository<Author, Integer> {}
public interface BookRepository extends JpaRepository<Book, Integer> {}
public interface LoanRepository extends JpaRepository<Loan, Integer> {}
public interface AdministratorRepository extends JpaRepository<Administrator, Integer> {}
