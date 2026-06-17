package com.proyecto.Gimnasio.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuarioDTO {

    public Long idUsuario;
    public String nombre;
    public String apellido;
    public Integer edad;
    public String email;
    public String telefono;
    public String direccion;
    public String password;
    public String rol;
    
}
