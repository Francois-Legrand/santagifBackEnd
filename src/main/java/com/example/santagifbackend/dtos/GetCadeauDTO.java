package com.example.santagifbackend.dtos;

import com.example.santagifbackend.models.User;
import lombok.Data;

@Data
public class GetCadeauDTO {
    private String id;
    private String title;
    private User user;
    private String image;
}

