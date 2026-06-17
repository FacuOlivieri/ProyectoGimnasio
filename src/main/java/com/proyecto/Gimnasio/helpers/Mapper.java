package com.proyecto.Gimnasio.helpers;
import com.proyecto.Gimnasio.dto.UsuarioDTO;
import com.proyecto.Gimnasio.model.Usuario;

public class Mapper {

    /**
     * Convierte cualquier entidad Usuario (Cliente, Entrenador, etc.) a UsuarioDTO.
     * Como se pasa la clase abstracta por parámetro, aprovecha el polimorfismo.
     */
    public static UsuarioDTO mapToUsuarioDto(Usuario usuario) {
        if (usuario == null) {
            return null;
            //Manejar nueva excepción
        }

        // Determinamos el rol dinámicamente si el campo 'rol' está vacío en la base de datos
        String rolDinamico = usuario.getRol();
        if (rolDinamico == null) {
            rolDinamico = usuario.getClass().getSimpleName().toUpperCase();
        }

        return UsuarioDTO.builder()
                .idUsuario(usuario.getIdUsuario())
                .nombre(usuario.getNombre())
                .apellido(usuario.getApellido())
                .edad(usuario.getEdad())
                .email(usuario.getEmail())
                .telefono(usuario.getTelefono())
                .direccion(usuario.getDireccion())
                .rol(rolDinamico)
                .build();
    }
}
