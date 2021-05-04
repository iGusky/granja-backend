package com.backend.granja.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name="usuarios" )
public class Usuario {
  
  @Id
  @GeneratedValue( strategy = GenerationType.AUTO )
  private Long id_usuario;

  private String nombre;
  private String apellido_paterno;
  private String apellido_materno;
  private String numero_telefonico;
  private String usuario;
  private String password;

  public Usuario(){};

  public Usuario(Long id_usuario, String nombre, String apellido_paterno, String apellido_materno,
  String numero_telefonico, String usuario, String password) {
    this.id_usuario = id_usuario;
    this.nombre = nombre;
    this.apellido_paterno = apellido_paterno;
    this.apellido_materno = apellido_materno;
    this.numero_telefonico = numero_telefonico;
    this.usuario = usuario;
    this.password = password;
  }

  public Long getId_usuario() {
    return id_usuario;
  }

  public void setId_usuario(Long id_usuario) {
    this.id_usuario = id_usuario;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido_paterno() {
    return apellido_paterno;
  }

  public void setApellido_paterno(String apellido_paterno) {
    this.apellido_paterno = apellido_paterno;
  }

  public String getApellido_materno() {
    return apellido_materno;
  }

  public void setApellido_materno(String apellido_materno) {
    this.apellido_materno = apellido_materno;
  }

  public String getNumero_telefonico() {
    return numero_telefonico;
  }

  public void setNumero_telefonico(String numero_telefonico) {
    this.numero_telefonico = numero_telefonico;
  }

  public String getUsuario() {
    return usuario;
  }

  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  


}
