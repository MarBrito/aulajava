package com.grupo7.aulajava.repository;

import com.grupo7.aulajava.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
