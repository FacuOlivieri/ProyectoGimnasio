
package com.proyecto.Gimnasio.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Asistencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAsistencia;
    private LocalDate fecha;

    @ManyToMany(mappedBy = "asistencias")
    private List<Cliente> clientes;
}
