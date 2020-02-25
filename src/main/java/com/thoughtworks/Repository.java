package com.thoughtworks;

import java.util.*;

public interface Repository<E> {
    boolean save(String id, E entity);
    E get(String id);
    E delete(String id);
    boolean update(String id, E entity);
    List<E> list();
}
