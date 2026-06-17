package com.proyecto.Gimnasio.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;


import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;


@Entity
@Table(name = "usuarios")

// Definimos la estrategia de herencia
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
// Columna que usará la BD para saber qué tipo de usuario es cada fila
@DiscriminatorColumn(name = "tipo_usuario", discriminatorType = DiscriminatorType.STRING)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder // CAMBIO: SuperBuilder en lugar de Builder para permitir herencia
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

    // Mapeamos el rol, indicando que JPA no lo inserte/actualice directamente si se usa la columna discriminadora
    @Column(name = "tipo_usuario", insertable = false, updatable = false)
    protected String rol;
}
