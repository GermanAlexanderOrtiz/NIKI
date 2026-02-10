package com.OSAL.NIKI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OSAL.NIKI.models.Usuario;
import com.OSAL.NIKI.services.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
  @Autowired
  private UsuarioService usuarioService;

  @PostMapping
  public Usuario agregar(@RequestBody Usuario usuario) {
    return usuarioService.guardarUsuario(usuario);
  }
}
