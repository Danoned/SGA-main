package com.aula12.conn.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="materia")
public class materia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome_materia;
    private String curso;   
    private String modalidade;
    private String professor;
    
    
    public materia() {
        
    }
    
    public materia(Long id, String nome_materia, String curso, String modalidade, String professor) {
        this.id = id;
        this.nome_materia = nome_materia;
        this.curso = curso;
        this.modalidade = modalidade;
        this.professor = professor;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome_materia() {
        return nome_materia;
    }

    public void setNome_materia(String nome_materia) {
        this.nome_materia = nome_materia;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getModalide() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }
 


}
