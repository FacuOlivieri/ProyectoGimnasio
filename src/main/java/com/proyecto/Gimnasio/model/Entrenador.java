package com.proyecto.Gimnasio.model;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Entrenador extends Usuario{


    private Long idEntrenador;
    private List<Rutina> rutinasCreadas;
    private Double salario;
}
