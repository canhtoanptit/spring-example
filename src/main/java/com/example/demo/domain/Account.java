package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Formula;

import java.util.Currency;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Account {

    @Id
    @GeneratedValue
    private Long id;

    private Double credit;

    private Double rate;

    private Currency currency;

    @Formula(value = "credit * rate")
    private Double interest;

    public UUID createdUuid;

    public UUID updatedUuid;

    @ManyToOne
    private Client client;

    private String description;
}
