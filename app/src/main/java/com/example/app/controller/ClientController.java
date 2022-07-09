package com.example.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.app.domain.Client;
import com.example.app.repository.ClientRepository;

@Controller
@RequestMapping(path="/client")
public class ClientController {

  @Autowired
  private ClientRepository clientRepository;

  @PutMapping
  public @ResponseBody String putClient(@RequestParam("name") String name) {
    Client client = new Client(name);
    clientRepository.save(client);
    return "saved";
  }

  @PostMapping
  public @ResponseBody String PostClient(@RequestParam("name") String name, @RequestParam("id") String id) {
    Client client = new Client(id, name);
    clientRepository.save(client);
    return "updated";
  }

  @GetMapping
  public @ResponseBody Client getClient(@RequestParam("id") String id) {
    Optional<Client> client = clientRepository.findById(id);
    return client.orElseGet(() -> new Client("NaN", ""));
  }

  @DeleteMapping
  public @ResponseBody String deleteClient(@RequestParam("id") String id) {
    clientRepository.deleteById(id);
    return "deleted";
  }

}
