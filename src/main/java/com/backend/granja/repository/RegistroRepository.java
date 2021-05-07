package com.backend.granja.repository;


import com.backend.granja.models.Registro;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistroRepository extends JpaRepository<Registro, Long> {
  // List<Registro> findById_dispositivo (Long id_dispositivo);
}
