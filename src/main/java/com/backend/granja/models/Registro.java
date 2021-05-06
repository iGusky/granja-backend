package com.backend.granja.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table( name = "registros" )
public class Registro {
  
  @Id
  @GeneratedValue( strategy = GenerationType.AUTO )
  private Long id_registro;

  private Date fecha;
  private Long id_remitente;
  
  private String mensaje;

  public Registro() {}

  public Registro(Long id_registro, Date fecha, Long id_remitente, String mensaje) {
    this.id_registro = id_registro;
    this.fecha = fecha;
    this.id_remitente = id_remitente;
    this.mensaje = mensaje;
  }

  public Long getId_registro() {
    return id_registro;
  }
  public void setId_registro(Long id_registro) {
    this.id_registro = id_registro;
  }
  public Date getFecha() {
    return fecha;
  }
  public void setFecha(Date fecha) {
    this.fecha = fecha;
  }
  public Long getId_remitente() {
    return id_remitente;
  }
  public void setId_remitente(Long id_remitente) {
    this.id_remitente = id_remitente;
  }
  public String getMensaje() {
    return mensaje;
  }
  public void setMensaje(String mensaje) {
    this.mensaje = mensaje;
  }
}
