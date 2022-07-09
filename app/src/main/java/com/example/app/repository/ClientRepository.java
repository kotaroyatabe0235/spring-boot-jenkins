package com.example.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.app.domain.Client;

public interface ClientRepository extends CrudRepository<Client, String> {
}
