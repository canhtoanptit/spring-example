package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Publisher {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToOne
    private Country country;
}
