package com.proyecto.Gimnasio.controller;

import com.proyecto.Gimnasio.dto.UsuarioDTO;
import com.proyecto.Gimnasio.service.UsuarioService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.security.auth.login.LoginException;

@Controller
public class UsuarioController {

    @Autowired
    public UsuarioService usuarioService;


    @GetMapping("/login")
    public String login(){
        return "index";
    }

    @GetMapping("/crearCuenta")
    public String crearCuenta(){
        return "registro";
    }

    @PostMapping("/login")
    public String login(@RequestParam String emailIngresado,
                        @RequestParam String passwordIngresada,
                        HttpSession session,
                        Model model) throws LoginException {



        //Validar usuario
        if (!usuarioService.encontrarMailDelUsuario(emailIngresado) ||
                !usuarioService.validarPassword(emailIngresado, passwordIngresada) ) {
            model.addAttribute("credencialesIncorrectas", "Usuario o Contrasenia incorrecta");
            return "redirect:/login";
        }



        UsuarioDTO usuario = usuarioService.encontrarUsuarioPorEmail(emailIngresado);
        session.setAttribute("usuario", usuario);
        model.addAttribute("nombreUsuario", usuario.getNombre());


        return "redirect:/home";
    }



    @PostMapping("/registro")
    public String crearUsuario(@RequestBody UsuarioDTO usuario,
                               Model model){

        usuarioService.crearUsuario(usuario);
        return "login";
    }



    @GetMapping("/home")
    public String home(HttpSession session){
        UsuarioDTO usuario = (UsuarioDTO) session.getAttribute("usuario");

        if(usuario == null){
            return "redirect:/login";
        }

        return "home";
    }


    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/login";
    }
}
