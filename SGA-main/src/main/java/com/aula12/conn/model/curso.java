package com.aula12.conn.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="curso")
public class curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome_curso;
    private String carga_horaria;
    private int materias;
    private int qtt_alunos;   
    
    public curso() {
        
    }
    
    public curso(Long id,String nome_curso, String carga_horaria, int qtt_alunos, int materias) {
        this.id = id;
        this.nome_curso = nome_curso;
        this.carga_horaria = carga_horaria;
        this.qtt_alunos = qtt_alunos;
        this.materias = materias;
    }

    public int getQtt_alunos() {
        return qtt_alunos;
    }

    public void setQtt_alunos(int qtt_alunos) {
        this.qtt_alunos = qtt_alunos;
    }

    public int getMaterias() {
        return materias;
    }

    public void setMaterias(int materias) {
        this.materias = materias;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome_curso() {
        return nome_curso;
    }

    public void setNome_curso(String nome_curso) {
        this.nome_curso = nome_curso;
    }

    public String getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(String carga_horaria) {
        this.carga_horaria = carga_horaria;
    }



}
