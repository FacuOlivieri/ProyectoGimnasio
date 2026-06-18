package com.proyecto.Gimnasio.model;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public abstract class Membresia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long idMembresia;
    protected Double precioMembresia;
    protected Integer diasHabilitados;
    protected Integer descuentoProductos;
    protected LocalDate diaInicio;
    protected LocalDate diaCaducidad;

    @OneToMany(mappedBy = "membresia", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    protected List<Cliente> clientesAsociados;

    public abstract Double calcularDescuento();
    
}
