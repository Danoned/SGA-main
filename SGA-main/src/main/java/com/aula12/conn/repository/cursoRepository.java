package com.aula12.conn.repository;

import org.springframework.data.repository.CrudRepository;
import com.aula12.conn.model.curso;

public interface cursoRepository extends CrudRepository<curso, Long> {
    
}