package com.proyecto.Gimnasio.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import java.util.List;

@Entity
@DiscriminatorValue("ENTRENADOR") // Valor en la columna tipo_usuario
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder // CAMBIO: SuperBuilder habilitado
public class Entrenador extends Usuario {

    // Se elimina 'idEntrenador', usa 'idUsuario' heredado automáticamente

    @OneToMany(mappedBy = "entrenador", cascade = CascadeType.ALL)
    private List<Rutina> rutinasCreadas;
    private Double salario;
}
