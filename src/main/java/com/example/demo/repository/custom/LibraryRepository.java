package com.example.demo.repository.custom;

import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Component;

@Component
public class LibraryRepository {
    private final EntityManager entityManager;

    public LibraryRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
