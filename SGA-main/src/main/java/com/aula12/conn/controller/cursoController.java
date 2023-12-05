package com.aula12.conn.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aula12.conn.model.curso;
import com.aula12.conn.service.cursoService;

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
public class cursoController {
    
    private  cursoService cursoService;
    
    @Autowired
    public void cursController(cursoService cursoService) {
        this.cursoService = cursoService;
    }

    @PostMapping("/cursos")
    public curso criar(@RequestBody curso e) {
        curso et = cursoService.save(e);
        return et;
    }

    @PutMapping("/cursos")
    public curso editar(@RequestBody curso est) {
        curso estud = cursoService.save(est);
        return estud;
    }


    @GetMapping("/cursos")
    public List<curso> listarcursos(Model model){
        return (List<curso>) cursoService.findAll();
    }

    @DeleteMapping("/cursos/{id}")
    public ResponseEntity<?> deletar(@PathVariable Long id) {
        cursoService.deleteById(id);
        return ResponseEntity.status(204).build();
    }
    

}
