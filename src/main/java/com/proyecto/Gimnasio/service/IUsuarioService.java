package com.proyecto.Gimnasio.service;

import com.proyecto.Gimnasio.dto.UsuarioDTO;

import java.util.List;

public interface IUsuarioService {

    UsuarioDTO crearUsuario(UsuarioDTO usuarioACrear);
    UsuarioDTO editarUsuario(Long idUsuarioAModificar, UsuarioDTO usuario);
    void borrarUsuario(Long idUsuario);
    List<UsuarioDTO> verUsuarios();
    UsuarioDTO encontrarUsuario(Long idUsuario);
}
