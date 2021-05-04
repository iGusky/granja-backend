package com.backend.granja.rest;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import com.backend.granja.models.Dispositivo;
import com.backend.granja.service.DispositivoService;

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
@RequestMapping("/dispositivos/")
public class DispositivoREST {
  @Autowired
  private DispositivoService dispositivoService;

  @PostMapping
  private ResponseEntity<Dispositivo> guardar(@RequestBody Dispositivo dispositivo){
    Dispositivo temporal = dispositivoService.create(dispositivo);
    try {
      return ResponseEntity.created(new URI("/dispositivos/"+temporal.getId_dispositivo())).body(temporal);
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
  }

  @GetMapping
  private ResponseEntity<List<Dispositivo>> listarTodosLosDisposisitivos(){
    return ResponseEntity.ok(dispositivoService.getAllDispositivos());
  }

  @DeleteMapping(value="{id}")
  private ResponseEntity<Void> eliminarDispositivo(@RequestBody Dispositivo dispositivo){
    dispositivoService.delete(dispositivo);
    return ResponseEntity.ok().build();
  }

  @GetMapping(value="{id")
  private ResponseEntity<Optional<Dispositivo>> mostrarDispositivo(@PathVariable Long id){
    return ResponseEntity.ok(dispositivoService.getOneDispositivo(id));
  }
}
