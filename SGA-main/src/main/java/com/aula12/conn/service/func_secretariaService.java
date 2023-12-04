package com.aula12.conn.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aula12.conn.model.func_secretaria;
import com.aula12.conn.repository.func_secretariaRepository;

@Service
public class func_secretariaService implements func_secretariaRepository {

    private final func_secretariaRepository funcDAO;

    @Autowired
    public func_secretariaService(func_secretariaRepository funcDAO)
    {
        this.funcDAO = funcDAO;
    }


    @Override
    public <S extends func_secretaria> S save(S entity) {
        return funcDAO.save(entity);
    }

    @Override
    public <S extends func_secretaria> Iterable<S> saveAll(Iterable<S> entities) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveAll'");
    }

    @Override
    public Optional<func_secretaria> findById(Long id) {
        // TODO Auto-generated method stub
        return funcDAO.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'existsById'");
    }

    @Override
    public Iterable<func_secretaria> findAll() {
        return funcDAO.findAll();
    }

    @Override
    public Iterable<func_secretaria> findAllById(Iterable<Long> ids) {
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
    funcDAO.deleteById(id);
    }

    @Override
    public void delete(func_secretaria entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAllById'");
    }

    @Override
    public void deleteAll(Iterable<? extends func_secretaria> entities) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }

    @Override
    public void deleteAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }
}