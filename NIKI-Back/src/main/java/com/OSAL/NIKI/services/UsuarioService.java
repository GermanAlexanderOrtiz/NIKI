package com.OSAL.NIKI.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OSAL.NIKI.models.Usuario;
import com.OSAL.NIKI.repository.UsuarioRepository;
import java.util.List;

@Service
public class UsuarioService {
  @Autowired
  private UsuarioRepository usuarioRepository;

  public Usuario guardarUsuario(Usuario usuario) {
    return usuarioRepository.save(usuario);
  }

  public List<Usuario> listarUsuarios() {
    return usuarioRepository.findAll();
  }

  public Usuario obtenerUsuario(Long id) {
    return usuarioRepository.findById(id).orElse(null);
  }

  public void eliminarUsuario(Long id) {
    usuarioRepository.deleteById(id);
  }

}
