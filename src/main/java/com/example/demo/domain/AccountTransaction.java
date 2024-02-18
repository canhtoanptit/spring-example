package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class AccountTransaction {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Account account;

    private Integer cents;

    private String description;
}
