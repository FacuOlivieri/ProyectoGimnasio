package com.proyecto.Gimnasio.controller;

import com.proyecto.Gimnasio.dto.UsuarioDTO;
import com.proyecto.Gimnasio.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.security.auth.login.LoginException;

@Controller
public class UsuarioController {

    @Autowired
    public UsuarioService usuarioService;


    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/procesarLogin")
    public String login(@PathVariable String emailIngresado,
                        String passwordIngresada,
                        Model model) throws LoginException {

        if (usuarioService.login(emailIngresado, passwordIngresada)){
            UsuarioDTO usuario = usuarioService.encontrarUsuarioPorEmail(emailIngresado);
            model.addAttribute("usuario", usuario);
            return "home";
        }

        return "login";
    }



    @PostMapping("/registro")
    public String crearUsuario(@RequestBody UsuarioDTO usuario,
                               Model model){

        usuarioService.crearUsuario(usuario);
        return "login";
    }

}
