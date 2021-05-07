package com.backend.granja.service;

import java.util.List;


import com.backend.granja.models.Registro;
import com.backend.granja.repository.RegistroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistroService {
  @Autowired
  private RegistroRepository registroRepository;

  public Registro create(Registro registro){
    return registroRepository.save(registro);
  }
  public List<Registro> getAllRegistros(){
    return registroRepository.findAll();
  }
  // public List<Registro> getRegistrosFromDispositivo(Long id_dispositivo){
  //   return registroRepository.findById_dispositivo(id_dispositivo);
  // }
}
