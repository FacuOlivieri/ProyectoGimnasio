package com.proyecto.Gimnasio.model;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class MembresiaBasica extends Membresia{

    @Override
    public Double calcularDescuento() {
        return 0.0;
    }
}
