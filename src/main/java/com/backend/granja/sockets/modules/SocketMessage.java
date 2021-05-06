package com.backend.granja.sockets.modules;

public class SocketMessage {
  private String userName; // Id_emisor;
  // private String userDestiny; // Id_remitente;
  private String message;

  
  public SocketMessage() {
  }
  
  public SocketMessage(String userName, String mensaje) {
    super();
    this.userName = userName;
    this.message = mensaje;
  }

  // public SocketMessage(String userName, String userDestiny, String mensaje) {
  //   super();
  //   this.userName = userName;
  //   this.userDestiny = userDestiny;
  //   this.mensaje = mensaje;
  // }

  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }
  // public String getUserDestiny() {
  //   return userDestiny;
  // }
  // public void setUserDestiny(String userDestiny) {
  //   this.userDestiny = userDestiny;
  // }
  public String getMensaje() {
    return message;
  }
  public void setMensaje(String mensaje) {
    this.message = mensaje;
  }

  @Override
  public String toString() {
    return "SocketMessage [mensaje=" + message + ", userName=" + userName + "]";
  }
  

}
