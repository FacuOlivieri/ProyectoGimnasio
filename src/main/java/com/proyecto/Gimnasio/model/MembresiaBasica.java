
package com.proyecto.Gimnasio.model;

import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@Setter
@SuperBuilder
public class MembresiaBasica extends Membresia{

    @Override
    public Double calcularDescuento() {
        return 0.0;
    }
}
