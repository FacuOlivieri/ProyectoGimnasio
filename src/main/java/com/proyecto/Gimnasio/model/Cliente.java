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
public class Cliente extends Usuario{

    private Long idCliente;
    private Double peso;
    private Double altura;


    private Rutina rutina;
    private Membresia membresia;
    private List<Asistencia> asistencias;

}
