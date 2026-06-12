package com.proyecto.Gimnasio.model;

import jakarta.persistence.Entity;
import lombok.*;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Asistencia {

    private Long idAsistencia;
    private LocalDate fecha;
}
