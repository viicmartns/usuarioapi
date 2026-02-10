package com.exemplo.usuarioapi.repository;

import com.exemplo.usuarioapi.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}

