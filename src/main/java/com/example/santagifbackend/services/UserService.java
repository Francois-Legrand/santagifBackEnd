package com.example.santagifbackend.services;

import com.example.santagifbackend.dtos.GetUserDTO;
import com.example.santagifbackend.models.User;
import com.example.santagifbackend.repositories.UserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    UserRepository repository;
    private ObjectMapper mapper;

    public UserService(UserRepository repository, ObjectMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<GetUserDTO> findAll() {
        List<User> users = this.repository.findAll();
        List<GetUserDTO> getUserDTOS = new ArrayList<>();
        users.forEach(user -> {
            getUserDTOS.add(this.mapper.convertValue(user, GetUserDTO.class));
        });
        return getUserDTOS;
    }

    public User save(User user) {
        return this.repository.save(user);
    }

    public void deleteById(String id) {
        this.repository.deleteById(id);
    }

}
