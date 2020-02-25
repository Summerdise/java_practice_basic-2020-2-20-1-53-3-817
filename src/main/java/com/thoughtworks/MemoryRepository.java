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
    public boolean save(String id, E entity) {
        if(!map.containsKey(id)){
            map.put(id,entity);
            return true;
        }
        return false;
    }

    @Override
    public E get(String id) {
        return map.get(id);
    }

    @Override
    public E delete(String id) {
        return map.remove(id);
    }

    @Override
    public boolean update(String id, E entity) {
        if(map.containsKey(id)){
            map.put(id,entity);
            return true;
        }
        return false;
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
