package com.backend.granja.service;

import com.backend.granja.models.Usuario;
import com.backend.granja.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService{
  @Autowired
  private UsuarioRepository usuarioRepository;

  public Usuario create( Usuario usuario ){
    return usuarioRepository.save( usuario );
  }

  public List<Usuario> getAllUsuarios(){
    return usuarioRepository.findAll();
  }

  public void delete ( Usuario usuario ){
    usuarioRepository.delete( usuario );
  }

  public Optional<Usuario> getOneUsuario ( Long id ) {
    return usuarioRepository.findById( id) ;
  }

}
