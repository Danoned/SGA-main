package com.aula12.conn.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.aula12.conn.model.estudante;
import com.aula12.conn.service.estudanteService;


import jakarta.servlet.http.HttpSession;



@Controller
public class loginController {



    @Autowired
    private estudanteService estDAO;

    
    @GetMapping("/")
    public String teste(Model model)
    {
        return "/index.html";
    }
    
    @PostMapping("/efetuar_login")
    public String efetuarlogin(estudante esta, RedirectAttributes ra, Model model,HttpSession session)
    {
        esta = this.estDAO.findByEmailAndSenha(esta.getEmail(), esta.getSenha());
        if(esta != null)
        {
            session.setAttribute("EstudanteLogado", esta);
            ra.addFlashAttribute("usuariologado", esta.getId());
            return "redirect:Tela_inicial.html";
        }else
        {
            ra.addFlashAttribute("mensagem", "teste");
            return "redirect:index.html";
        }
    }
    @GetMapping("/perfil")
    @ResponseBody
    public Object teste(HttpSession session)
    {
       return session.getAttribute("EstudanteLogado");
    }
}
