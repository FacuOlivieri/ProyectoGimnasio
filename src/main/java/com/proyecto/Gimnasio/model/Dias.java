package com.proyecto.Gimnasio.model;

import com.proyecto.Gimnasio.enums.Dia;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Dias {

    @Id
    private Integer idDia;
    private Dia nombreDia;

    @ManyToMany(mappedBy = "dias")
    private List<Rutina> rutinas;
}
