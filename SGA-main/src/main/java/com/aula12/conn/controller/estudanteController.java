package com.aula12.conn.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aula12.conn.model.estudante;
import com.aula12.conn.service.estudanteService;

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
public class estudanteController {
    
    private  estudanteService estudanteService;
    
    @Autowired
    public void estudaController(estudanteService estudanteService) {
        this.estudanteService = estudanteService;
    }

    @PostMapping("/estudantes")
    public estudante criar(@RequestBody estudante e) {
        estudante et = estudanteService.save(e);
        return et;
    }

    @PutMapping("/estudantes")
    public estudante editar(@RequestBody estudante est) {
        estudante estud = estudanteService.save(est);
        return estud;
    }


    @GetMapping("/estudantes")
    public List<estudante> listarEstudantes(Model model){
        return (List<estudante>) estudanteService.findAll();
    }

    @DeleteMapping("/estudantes/{id}")
    public ResponseEntity<?> deletar(@PathVariable Long id) {
        estudanteService.deleteById(id);
        return ResponseEntity.status(204).build();
    }
    

}
