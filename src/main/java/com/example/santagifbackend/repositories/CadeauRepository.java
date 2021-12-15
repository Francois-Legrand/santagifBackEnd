package com.example.santagifbackend.repositories;

import com.example.santagifbackend.models.Cadeau;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CadeauRepository extends MongoRepository<Cadeau, String> {

}
