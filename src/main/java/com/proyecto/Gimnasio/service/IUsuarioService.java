package com.proyecto.Gimnasio.service;

import com.proyecto.Gimnasio.dto.UsuarioDTO;

import javax.security.auth.login.LoginException;
import java.util.List;

public interface IUsuarioService {

    UsuarioDTO crearUsuario(UsuarioDTO usuarioACrear);
    UsuarioDTO editarUsuario(Long idUsuarioAModificar, UsuarioDTO usuario);
    void borrarUsuario(Long idUsuario);
    List<UsuarioDTO> verUsuarios();
    UsuarioDTO encontrarUsuario(Long idUsuario);
    UsuarioDTO encontrarUsuarioPorEmail(String emailIngresado);

    boolean login(String username, String password) throws LoginException;


}
