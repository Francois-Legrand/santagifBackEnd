package com.example.santagifbackend.configs;

import com.example.santagifbackend.repositories.CadeauRepository;
import com.example.santagifbackend.repositories.UserRepository;
import com.example.santagifbackend.services.CadeauService;
import com.example.santagifbackend.services.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CadeauConfig {
    @Bean
    public CadeauService cadeauService(CadeauRepository cadeaurepository, ObjectMapper mapper) {
        return new CadeauService(cadeaurepository, mapper);
    }
    @Bean
    public UserService userService(UserRepository userRepository, ObjectMapper mapper){
        return new UserService(userRepository, mapper);
    }

}
