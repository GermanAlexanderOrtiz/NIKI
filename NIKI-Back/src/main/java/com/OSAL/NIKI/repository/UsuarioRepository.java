package com.OSAL.NIKI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OSAL.NIKI.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
