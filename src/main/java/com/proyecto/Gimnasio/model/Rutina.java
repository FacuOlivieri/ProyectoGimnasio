package com.proyecto.Gimnasio.model;

import com.proyecto.Gimnasio.model.Dias;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    private List<Dias> dias;
    private String descripcionRutina;
    private List <Ejercicio> ejercicios;
}
