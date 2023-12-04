package com.aula12.conn.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aula12.conn.model.administrador;
import com.aula12.conn.service.administradorService;

import ch.qos.logback.core.model.Model;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@CrossOrigin("*")
public class administradorController {
    
    private  administradorService administradorService;
    
    @Autowired
    public void admController(administradorService administradorService) {
        this.administradorService = administradorService;
    }

    @PostMapping("/administradores")
    public administrador criar(@RequestBody administrador e) {
        administrador et = administradorService.save(e);
        return et;
    }

    @PutMapping("/administradores")
    public administrador editar(@RequestBody administrador est) {
        administrador estud = administradorService.save(est);
        return estud;
    }


    @GetMapping("/administradores")
    public List<administrador> listaradministradors(Model model){
        return (List<administrador>) administradorService.findAll();
    }

    @DeleteMapping("/administradores/{id}")
    public ResponseEntity<?> deletar(@PathVariable Long id) {
        administradorService.deleteById(id);
        return ResponseEntity.status(204).build();
    }
    

}
