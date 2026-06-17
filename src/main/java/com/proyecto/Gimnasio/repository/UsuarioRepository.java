package com.proyecto.Gimnasio.repository;

import com.proyecto.Gimnasio.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
}
