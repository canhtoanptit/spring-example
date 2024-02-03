package com.example.demo.service;

import com.example.demo.domain.Collection;
import com.example.demo.repository.CollectionRepository;
import org.springframework.stereotype.Service;

@Service
public class CollectionService {

    private CollectionRepository collectionRepository;

    public CollectionService(CollectionRepository collectionRepository) {
        this.collectionRepository = collectionRepository;
    }

    public Collection createCollection(Collection collection) {
        return collectionRepository.save(collection);
    }
}
