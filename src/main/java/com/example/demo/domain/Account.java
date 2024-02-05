package com.example.demo.domain;

import com.example.demo.domain.anotation.GeneratedUuidValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Formula;
import org.hibernate.tuple.GenerationTiming;

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

    @GeneratedUuidValue( timing = GenerationTiming.INSERT )
    public UUID createdUuid;

    @GeneratedUuidValue( timing = GenerationTiming.ALWAYS )
    public UUID updatedUuid;
}
