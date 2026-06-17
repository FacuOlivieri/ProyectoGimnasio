package com.proyecto.Gimnasio.controller;

import com.proyecto.Gimnasio.dto.UsuarioDTO;
import com.proyecto.Gimnasio.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UsuarioController {

    @Autowired
    public UsuarioService usuarioController;


    @PostMapping
    public String guardarUsuario(Model model,
                                 @RequestBody UsuarioDTO usuario){




        return "usuario guardado";
    }

}
