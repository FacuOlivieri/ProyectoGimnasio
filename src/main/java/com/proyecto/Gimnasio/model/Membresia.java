package com.proyecto.Gimnasio.model;


import com.proyecto.Gimnasio.enums.TipoMembresia;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Membresia {

    private Long idMembresia;
    private TipoMembresia tipoMembresia;
}
