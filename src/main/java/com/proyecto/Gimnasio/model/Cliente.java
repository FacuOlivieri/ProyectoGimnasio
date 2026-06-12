package com.proyecto.Gimnasio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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


    @ManyToOne
    @JoinColumn(name = "id_rutina")
    private Rutina rutina;

    @ManyToOne
    @JoinColumn(name = "id_membresia")
    private Membresia membresia;

    private List<Asistencia> asistencias;

}
