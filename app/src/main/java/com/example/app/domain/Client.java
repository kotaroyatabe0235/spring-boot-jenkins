package com.example.app.domain;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client {

  @Id
  private String clientId;
  private String clientName;

  public Client() {
    clientId = UUID.randomUUID().toString();
  }

  public Client(String clientName) {
    clientId = UUID.randomUUID().toString();
    this.clientName = clientName;
  }

  public Client(String clientId, String clientName) {
    this.clientId = clientId;
    this.clientName = clientName;
  }

  public String getClientId() {
    return clientId;
  }

  public String getClientName() {
    return clientName;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }
  
}
