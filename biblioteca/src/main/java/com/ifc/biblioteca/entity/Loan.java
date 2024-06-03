package com.ifc.biblioteca.entity;

import jakarta.persistence.*;
import java.util.Date;


import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "loan")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idLoan;
    private Date loanDate;
    private Date returnDate;
    
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private User user;
    @ManyToOne
    @JoinColumn(name = "id_livro")
    private Book book;

}
