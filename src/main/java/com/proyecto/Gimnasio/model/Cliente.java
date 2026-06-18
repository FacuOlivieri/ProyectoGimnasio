package com.proyecto.Gimnasio.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
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

    @ManyToMany
    private List<Asistencia> asistencias;

}
