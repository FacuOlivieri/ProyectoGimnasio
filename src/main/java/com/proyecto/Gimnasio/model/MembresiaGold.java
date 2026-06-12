package com.proyecto.Gimnasio.model;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class MembresiaGold extends Membresia{

    @Override
    public Double calcularDescuento() {
        return 0.0;
    }
}
