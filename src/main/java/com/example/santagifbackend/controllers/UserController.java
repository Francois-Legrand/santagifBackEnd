package com.example.santagifbackend.controllers;

import com.example.santagifbackend.dtos.GetUserDTO;
import com.example.santagifbackend.models.User;
import com.example.santagifbackend.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("users")
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }
    @GetMapping
    public List<GetUserDTO> findAll(){
        return service.findAll();
    }
    @PostMapping
    public User save(@RequestBody User user){
        return service.save(user);
    }
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id){
        service.deleteById(id);
    }
}
