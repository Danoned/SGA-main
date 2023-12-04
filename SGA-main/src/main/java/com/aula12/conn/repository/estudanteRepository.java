package com.aula12.conn.repository;

import org.springframework.data.repository.CrudRepository;
import com.aula12.conn.model.estudante;

public interface estudanteRepository extends CrudRepository<estudante, Long> {
    public estudante findByEmailAndSenha(String email, String senha);
    
}
