package com.proyecto.Gimnasio.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import java.util.List;

@Entity
@DiscriminatorValue("ENTRENADOR") // Valor en la columna tipo_usuario
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class Entrenador extends Usuario {


    //Poner un id incrementable?
    private Long idEntrenador;

    @OneToMany(mappedBy = "entrenadorCreador", cascade = CascadeType.ALL)
    private List<Rutina> rutinasCreadas;
    private Double salario;

}
