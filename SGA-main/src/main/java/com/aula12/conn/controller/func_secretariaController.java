package com.aula12.conn.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aula12.conn.model.func_secretaria;
import com.aula12.conn.service.func_secretariaService;

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
@RequestMapping("/func")
public class func_secretariaController {
    
    private  func_secretariaService func_secretariaService;
    
    @Autowired
    public void secretaController(func_secretariaService func_secretariaService) {
        this.func_secretariaService = func_secretariaService;
    }

    @PostMapping
    public func_secretaria criar(@RequestBody func_secretaria e) {
        func_secretaria et = func_secretariaService.save(e);
        return et;
    }

    @PutMapping
    public func_secretaria editar(@RequestBody func_secretaria est) {
        func_secretaria estud = func_secretariaService.save(est);
        return estud;
    }


    @GetMapping
    public List<func_secretaria> listarfunc_secretarias(Model model){
        return (List<func_secretaria>) func_secretariaService.findAll();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable Long id) {
        func_secretariaService.deleteById(id);
        return ResponseEntity.status(204).build();
    }
    

}
