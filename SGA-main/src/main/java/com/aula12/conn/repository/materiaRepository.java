package com.aula12.conn.repository;

import org.springframework.data.repository.CrudRepository;
import com.aula12.conn.model.materia;

public interface materiaRepository extends CrudRepository<materia, Long> {
    
}