package com.proyecto.Gimnasio.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.proyecto.Gimnasio.model.Dias;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Rutina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRutina;
    private String descripcionRutina;
    private String rutaImagenRutina;

    @ManyToMany
    private List<Dias> dias;


    @ManyToMany
    private List <Ejercicio> ejercicios;

    @ManyToOne
    @JoinColumn(name = "idCliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "idEntrenador")
    private Entrenador entrenadorCreador;
}
