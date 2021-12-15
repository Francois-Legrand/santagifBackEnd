package com.example.santagifbackend.controllers;

import com.example.santagifbackend.dtos.GetCadeauDTO;
import com.example.santagifbackend.models.Cadeau;
import com.example.santagifbackend.services.CadeauService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("cadeaux")
public class CadeauController {
    @Autowired
    CadeauService service;

    @GetMapping
    public List<GetCadeauDTO> findAll() {
        return service.findAll();
    }
    @PostMapping
    public Cadeau save(@RequestBody Cadeau cadeau) {
        return service.save(cadeau);
    }
    @DeleteMapping
    public void delete(@RequestBody Cadeau cadeau) {
        service.delete(cadeau);
    }
}