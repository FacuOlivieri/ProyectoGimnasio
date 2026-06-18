package com.proyecto.Gimnasio.service;

import com.proyecto.Gimnasio.dto.UsuarioDTO;
import com.proyecto.Gimnasio.helpers.Mapper;
import com.proyecto.Gimnasio.model.*;
import com.proyecto.Gimnasio.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.security.auth.login.LoginException;
import java.util.List;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public boolean login(String emailIngresado, String passwordIngresada) throws LoginException {
        UsuarioDTO usuarioEncontrado =  Mapper.mapToUsuarioDto(usuarioRepository.findByEmail(emailIngresado));

        if (usuarioEncontrado == null || !usuarioEncontrado.getPassword().equals(passwordIngresada)){
            throw new LoginException("Usuario o Password incorrecto");
        }

        return true;
    }


    @Override
    public UsuarioDTO crearUsuario(UsuarioDTO usuarioACrear) {
        Usuario usuarioEntidad;

        // 1. Instanciamos la clase hija correspondiente según el rol
        switch (usuarioACrear.getRol().toUpperCase()) {
            case "CLIENTE":
                // Nota: Si no tienes creada la clase Cliente, recuerda crearla igual que las demás
                usuarioEntidad = new Cliente();
                break;
            case "ENTRENADOR":
                usuarioEntidad = new Entrenador();
                break;
            case "RECEPCIONISTA":
                usuarioEntidad = new Recepcionista();
                break;
            case "ADMINISTRADOR":
                usuarioEntidad = new Administrador();
                break;
            default:
                throw new IllegalArgumentException("El rol especificado no es válido");
        }


        usuarioEntidad.setNombre(usuarioACrear.getNombre());
        usuarioEntidad.setApellido(usuarioACrear.getApellido());
        usuarioEntidad.setPassword(usuarioACrear.getPassword());
        usuarioEntidad.setEdad(usuarioACrear.getEdad());
        usuarioEntidad.setEmail(usuarioACrear.getEmail());
        usuarioEntidad.setTelefono(usuarioACrear.getTelefono());
        usuarioEntidad.setDireccion(usuarioACrear.getDireccion());


        // 3. Guardamos la entidad en la base de datos a través de JPA
        // Al usar la herencia SINGLE_TABLE, Hibernate insertará el DiscriminatorValue
        // automáticamente (ej. "ENTRENADOR") en la columna tipo_usuario.
        Usuario usuarioGuardado = usuarioRepository.save(usuarioEntidad);

        // 4. Devolvemos el DTO utilizando el Mapper estático que creaste en el Helper
        return Mapper.mapToUsuarioDto(usuarioGuardado);
    }







    @Override
    public UsuarioDTO editarUsuario(Long idUsuarioAModificar, UsuarioDTO usuario) {
        return null;
    }

    @Override
    public void borrarUsuario(Long idUsuario) {

    }

    @Override
    public List<UsuarioDTO> verUsuarios() {
        return List.of();
    }

    @Override
    public UsuarioDTO encontrarUsuario(Long idUsuario) {
        return null;
    }

    @Override
    public UsuarioDTO encontrarUsuarioPorEmail(String emailIngresado) {
        return Mapper.mapToUsuarioDto(usuarioRepository.findByEmail(emailIngresado));
    }


}






