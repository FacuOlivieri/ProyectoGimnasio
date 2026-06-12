package com.proyecto.Gimnasio.model;

import jakarta.persistence.Entity;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Recepcionista extends Usuario{


    private Long idRecepcionista;
    private Double salario;
}
