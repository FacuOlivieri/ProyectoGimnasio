package com.proyecto.Gimnasio.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public abstract class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long idUsuario;
    protected String nombre;
    protected String apellido;
    protected Integer edad;
    protected String email;
    protected String telefono;
    protected String direccion;
    protected String password;


}
