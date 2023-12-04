package com.aula12.conn.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aula12.conn.model.estudante;
import com.aula12.conn.repository.estudanteRepository;

@Service
public class estudanteService implements estudanteRepository {

    private final estudanteRepository estDAO;

    @Autowired
    public estudanteService(estudanteRepository estDAO)
    {
        this.estDAO = estDAO;
    }


    @Override
    public <S extends estudante> S save(S entity) {
        return estDAO.save(entity);
    }

    @Override
    public <S extends estudante> Iterable<S> saveAll(Iterable<S> entities) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveAll'");
    }

    @Override
    public Optional<estudante> findById(Long id) {
        // TODO Auto-generated method stub
        return estDAO.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'existsById'");
    }

    @Override
    public Iterable<estudante> findAll() {
        return estDAO.findAll();
    }

    @Override
    public Iterable<estudante> findAllById(Iterable<Long> ids) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAllById'");
    }

    @Override
    public long count() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'count'");
    }

    @Override
    public void deleteById(Long id) {
    estDAO.deleteById(id);
    }

    @Override
    public void delete(estudante entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAllById'");
    }

    @Override
    public void deleteAll(Iterable<? extends estudante> entities) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }

    @Override
    public void deleteAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }


    @Override
    public estudante findByEmailAndSenha(String email, String senha) {
        return estDAO.findByEmailAndSenha(email, senha);
    }
}