package com.example.santagifbackend.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document
@NoArgsConstructor
@AllArgsConstructor
public class Enfant extends User{
    @Getter
    @Setter
    private List<Cadeau> souhait;

}
