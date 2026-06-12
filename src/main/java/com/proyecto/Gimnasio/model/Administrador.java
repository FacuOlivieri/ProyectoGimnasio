package com.proyecto.Gimnasio.model;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Administrador extends Usuario{

    private Long idAdministrador;

}
