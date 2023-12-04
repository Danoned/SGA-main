package com.aula12.conn.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aula12.conn.model.curso;
import com.aula12.conn.repository.cursoRepository;

@Service
public class cursoService implements cursoRepository {

    private final cursoRepository cursDAO;

    @Autowired
    public cursoService(cursoRepository cursDAO)
    {
        this.cursDAO = cursDAO;
    }


    @Override
    public <S extends curso> S save(S entity) {
        return cursDAO.save(entity);
    }

    @Override
    public <S extends curso> Iterable<S> saveAll(Iterable<S> entities) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveAll'");
    }

    @Override
    public Optional<curso> findById(Long id) {
        // TODO Auto-generated method stub
        return cursDAO.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'existsById'");
    }

    @Override
    public Iterable<curso> findAll() {
        return cursDAO.findAll();
    }

    @Override
    public Iterable<curso> findAllById(Iterable<Long> ids) {
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
    cursDAO.deleteById(id);
    }

    @Override
    public void delete(curso entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAllById'");
    }

    @Override
    public void deleteAll(Iterable<? extends curso> entities) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }

    @Override
    public void deleteAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }
}