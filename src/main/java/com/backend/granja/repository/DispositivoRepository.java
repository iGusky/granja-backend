package com.backend.granja.repository;

import com.backend.granja.models.Dispositivo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DispositivoRepository extends JpaRepository<Dispositivo, Long>{
  
}
