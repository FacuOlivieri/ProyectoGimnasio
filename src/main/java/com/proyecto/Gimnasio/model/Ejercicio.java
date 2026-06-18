package com.proyecto.Gimnasio.model;

import com.proyecto.Gimnasio.enums.Dificultad;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Ejercicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEjercicio;
    private Dificultad dificultad;
    private String descripcionEjercicio;

    @ManyToMany(mappedBy = "ejercicios")
    private List<Rutina> rutinasImplementadas;
}
