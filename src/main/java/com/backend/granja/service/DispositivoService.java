package com.backend.granja.service;

import java.util.List;
import java.util.Optional;

import com.backend.granja.models.Dispositivo;
import com.backend.granja.repository.DispositivoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DispositivoService {
   @Autowired
   private DispositivoRepository dispositivoRepository;

   public Dispositivo create(Dispositivo dispositivo){
    return dispositivoRepository.save(dispositivo);
   }

   public List<Dispositivo> getAllDispositivos(){
    return dispositivoRepository.findAll();
   }

   public void delete(Dispositivo dispositivo){
     dispositivoRepository.delete(dispositivo);
   }

   public Optional<Dispositivo> getOneDispositivo(Long id){
     return dispositivoRepository.findById(id);
   }
}
