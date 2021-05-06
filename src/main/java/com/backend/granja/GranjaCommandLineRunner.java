package com.backend.granja;

import com.corundumstudio.socketio.SocketIOServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class GranjaCommandLineRunner implements CommandLineRunner {

  private final SocketIOServer server;

  @Autowired
  public GranjaCommandLineRunner(SocketIOServer server){
    this.server = server;
  }

  @Override
  public void run(String... args) throws Exception {
    server.start();
  }
  
}
