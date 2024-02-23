package com.example.demo.cache;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

public class InMemoryLruCache<K, V> implements Cache<K, V> {

    private final int capacity;
    private final Map<K, ConcurrentLinkedQueue<CacheElement<K, V>>> linkedListNodeMap;
    private final ConcurrentLinkedDeque<CacheElement<K, V>> doublyLinkedList;

    public InMemoryLruCache(int capacity) {
        this.capacity = capacity;
        this.linkedListNodeMap = new ConcurrentHashMap<>(capacity);
        this.doublyLinkedList = new ConcurrentLinkedDeque<>();
    }

    @Override
    public boolean put(K key, V value) {
        return false;
    }

    @Override
    public Optional<V> get(K key) {
        return Optional.empty();
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }
}
