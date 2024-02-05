package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.NaturalId;

@Entity
@Getter
@Setter
public class Country {

    @Id
    @GeneratedValue
    private Long id;

    @NaturalId
    private String name;
}
