package com.aula12.conn.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aula12.conn.model.administrador;
import com.aula12.conn.repository.administradorRepository;

@Service
public class administradorService implements administradorRepository {

    private final administradorRepository admDAO;

    @Autowired
    public administradorService(administradorRepository admDAO)
    {
        this.admDAO = admDAO;
    }


    @Override
    public <S extends administrador> S save(S entity) {
        return admDAO.save(entity);
    }

    @Override
    public <S extends administrador> Iterable<S> saveAll(Iterable<S> entities) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveAll'");
    }

    @Override
    public Optional<administrador> findById(Long id) {
        // TODO Auto-generated method stub
        return admDAO.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'existsById'");
    }

    @Override
    public Iterable<administrador> findAll() {
        return admDAO.findAll();
    }

    @Override
    public Iterable<administrador> findAllById(Iterable<Long> ids) {
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
    admDAO.deleteById(id);
    }

    @Override
    public void delete(administrador entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAllById'");
    }

    @Override
    public void deleteAll(Iterable<? extends administrador> entities) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }

    @Override
    public void deleteAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }
}