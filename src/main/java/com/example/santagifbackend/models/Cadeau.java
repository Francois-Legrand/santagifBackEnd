package com.example.santagifbackend.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@NoArgsConstructor
@AllArgsConstructor
public class Cadeau {
    @Id
    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private String title;

}
