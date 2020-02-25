package com.thoughtworks;

import java.util.*;

public interface Repository<E> {
    void save(String id, E entity);
    void get(String id);
    void delete(String id);
    void update(String id, E entity);
    List<E> list();
}
