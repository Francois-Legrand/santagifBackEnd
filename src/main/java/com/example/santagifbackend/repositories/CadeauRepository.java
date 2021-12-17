package com.example.santagifbackend.repositories;

import com.example.santagifbackend.models.Cadeau;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CadeauRepository extends MongoRepository<Cadeau, String> {

}
