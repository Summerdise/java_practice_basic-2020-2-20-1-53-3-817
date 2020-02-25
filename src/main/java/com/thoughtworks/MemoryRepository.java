package com.thoughtworks;

import java.util.*;

public class MemoryRepository<E> implements Repository<E> {
    Map<String,E> map;

    public MemoryRepository() {
        map = new HashMap<>();
    }

    public MemoryRepository(Map<String, E> map) {
        this.map = map;
    }

    public void setMap(Map<String, E> map) {
        this.map = map;
    }

    @Override
    public void save(String id, E entity) {
        map.put(id,entity);
    }

    @Override
    public void get(String id) {
        map.get(id);
    }

    @Override
    public void delete(String id) {
        map.remove(id);
    }

    @Override
    public void update(String id, E entity) {
        map.put(id,entity);
    }

    @Override
    public List<E> list() {
        List<E> list = new ArrayList<>();
        for(String id:map.keySet()){
            list.add(map.get(id));
        }
        return list;
    }
}
