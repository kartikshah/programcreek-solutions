package com.kartikshah.programcreek.lrucache;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LRUCache2 < K, V > extends LinkedHashMap < K, V > {

    private int capacity; // Maximum number of items in the cache.

    public LRUCache2(int capacity) {
        super(capacity+1, 1.0f, true); // Pass 'true' for accessOrder.
        this.capacity = capacity;
    }

    protected boolean removeEldestEntry(Entry entry) {
        return (size() > this.capacity);
    }
}