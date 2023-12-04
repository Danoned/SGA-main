package com.aula12.conn.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aula12.conn.model.materia;
import com.aula12.conn.service.materiaService;

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
@RequestMapping("/materias")
public class materiaController {
    
    private  materiaService materiaService;
    
    @Autowired
    public void matController(materiaService materiaService) {
        this.materiaService = materiaService;
    }

    @PostMapping
    public materia criar(@RequestBody materia e) {
        materia et = materiaService.save(e);
        return et;
    }

    @PutMapping
    public materia editar(@RequestBody materia est) {
        materia estud = materiaService.save(est);
        return estud;
    }


    @GetMapping
    public List<materia> listarmaterias(Model model){
        return (List<materia>) materiaService.findAll();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable Long id) {
        materiaService.deleteById(id);
        return ResponseEntity.status(204).build();
    }
    

}
