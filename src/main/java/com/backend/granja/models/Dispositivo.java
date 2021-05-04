package com.backend.granja.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dispositivos" )
public class Dispositivo {
  @Id
  @GeneratedValue( strategy = GenerationType.AUTO )
  private Long id_dispositivo;

  private String nombre;
  private String modelo;
  private String numero_serie;

  public Dispositivo() {}

  public Dispositivo(Long id_dispositivo, String nombre, String modelo, String numero_serie) {
    this.id_dispositivo = id_dispositivo;
    this.nombre = nombre;
    this.modelo = modelo;
    this.numero_serie = numero_serie;
  }
  public Long getId_dispositivo() {
    return id_dispositivo;
  }
  public void setId_dispositivo(Long id_dispositivo) {
    this.id_dispositivo = id_dispositivo;
  }
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public String getModelo() {
    return modelo;
  }
  public void setModelo(String modelo) {
    this.modelo = modelo;
  }
  public String getNumero_serie() {
    return numero_serie;
  }
  public void setNumero_serie(String numero_serie) {
    this.numero_serie = numero_serie;
  }
}
