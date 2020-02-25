package com.thoughtworks;

import java.util.*;

public class RepositoryUtil<E> {
    public static <E> void printList(List<E> list){
        for(E e:list){
            System.out.println(e.toString());
        }
    }
}
