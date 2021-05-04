package com.backend.granja.rest;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import com.backend.granja.models.Usuario;
import com.backend.granja.service.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios/")
public class UsuarioREST {
  @Autowired
  private UsuarioService usuarioService;

  @PostMapping
  private ResponseEntity<Usuario> guardar(@RequestBody Usuario usuario) {
    Usuario temporal = usuarioService.create(usuario);
    try {
      return ResponseEntity.created( new URI("/usuarios/"+temporal.getId_usuario())).body(temporal);
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
  }

  @GetMapping
  private ResponseEntity<List<Usuario>> listarTodosLosUsuarios() {
    return ResponseEntity.ok(usuarioService.getAllUsuarios());
  }

  @DeleteMapping
  private ResponseEntity<Void> eliminarUsuario(@RequestBody Usuario usuario) {
    usuarioService.delete(usuario);
    return ResponseEntity.ok().build();
  }

  @GetMapping( value="{id}" )
  private ResponseEntity<Optional<Usuario>> mostrarUsuario( @PathVariable Long id ) {
    return ResponseEntity.ok(usuarioService.getOneUsuario(id));
  }
}
