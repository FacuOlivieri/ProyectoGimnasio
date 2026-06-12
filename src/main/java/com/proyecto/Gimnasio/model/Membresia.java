package com.proyecto.Gimnasio.model;


import jakarta.persistence.Entity;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public abstract class Membresia {

    protected Long idMembresia;
    protected Double precioMembresia;
    protected Integer diasHabilitados;
    protected Integer descuentoProductos;
    protected LocalDate diaInicio;
    protected LocalDate diaCaducidad;

    protected List<Cliente> clientesAsociados;

    public abstract Double calcularDescuento();
    
}
