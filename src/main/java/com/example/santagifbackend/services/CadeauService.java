package com.example.santagifbackend.services;

import com.example.santagifbackend.dtos.GetCadeauDTO;
import com.example.santagifbackend.models.Cadeau;
import com.example.santagifbackend.repositories.CadeauRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class CadeauService {

    CadeauRepository repository;
    private ObjectMapper mapper;

    public CadeauService(CadeauRepository repository, ObjectMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }
    public List<GetCadeauDTO> findAll() {
        List<Cadeau> cadeaux = this.repository.findAll();
        List<GetCadeauDTO> getCadeauDTOS = new ArrayList<>();
        cadeaux.forEach(cadeau -> {
                getCadeauDTOS.add(this.mapper.convertValue(cadeau, GetCadeauDTO.class));
        });
        return getCadeauDTOS;
    }
    public Cadeau save(Cadeau cadeau) {
        return this.repository.save(cadeau);
    }
    public void deleteById(String id) {
        this.repository.deleteById(id);
    }
}
