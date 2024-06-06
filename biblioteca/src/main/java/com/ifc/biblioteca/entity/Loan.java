package com.ifc.biblioteca.entity;

import jakarta.persistence.*;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "loan")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date loanDate;
    private Date returnDate;
    
    @ManyToOne
    @JoinColumn(name = "user_fk")
    private User user;
    @ManyToOne
    @JoinColumn(name = "book_fk")
    private Book book;

}
