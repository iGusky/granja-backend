package com.backend.granja.sockets.modules;

import com.corundumstudio.socketio.HandshakeData;
import com.corundumstudio.socketio.SocketIONamespace;
import com.corundumstudio.socketio.SocketIOServer;
import com.corundumstudio.socketio.listener.ConnectListener;
import com.corundumstudio.socketio.listener.DataListener;
import com.corundumstudio.socketio.listener.DisconnectListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SocketsModule {
  private static final Logger log = LoggerFactory.getLogger(SocketsModule.class);
  private final SocketIONamespace namespace;
  @Autowired
  public SocketsModule(SocketIOServer server){
    this.namespace = server.addNamespace("/granja");
    this.namespace.addConnectListener(onConnected());
    this.namespace.addDisconnectListener(onDisconnected());
    this.namespace.addEventListener("chat", SocketMessage.class, onMessageReceived());
  }

  private DataListener<SocketMessage> onMessageReceived(){
    return( client, data, ackSender ) -> {
      log.debug("Client[{}] - Received message '{}'", client.getSessionId().toString(), data);
      namespace.getBroadcastOperations().sendEvent("message", data);
    };
  }

  private ConnectListener onConnected() {
    return client -> {
      HandshakeData handshakeData = client.getHandshakeData();
      log.debug("Client[{}] - Connected to socket module througth '{}'", client.getSessionId().toString(), handshakeData.getUrl());
    };
  }

  private DisconnectListener onDisconnected(){
    return client -> {
      log.debug("Client[{}] - Disconnected from socket module.", client.getSessionId().toString());
    };
  }
}
