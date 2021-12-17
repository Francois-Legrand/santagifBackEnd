package com.example.santagifbackend.dtos;

import com.example.santagifbackend.models.Cadeau;
import lombok.Data;

import java.util.List;

@Data
public class GetUserDTO {
    private String id;
    private String nom;
    private String prenom;
    private List<Cadeau> cadeaux;
}
