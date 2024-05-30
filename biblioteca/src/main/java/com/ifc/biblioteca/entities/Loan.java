package com.ifc.biblioteca.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmprestimo;
    private Date dataEmprestimo;
    private Date dataDevolucao;
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private User usuario;
    @ManyToOne
    @JoinColumn(name = "id_livro")
    private Book livro;
    
    public int getIdEmprestimo() {
        return idEmprestimo;
    }
    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }
    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }
    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
    public Date getDataDevolucao() {
        return dataDevolucao;
    }
    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    public User getUsuario() {
        return usuario;
    }
    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }
    public Book getLivro() {
        return livro;
    }
    public void setLivro(Book livro) {
        this.livro = livro;
    }

    
}
