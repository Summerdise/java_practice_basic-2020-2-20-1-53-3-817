package com.thoughtworks;

import java.util.*;

public class App {

  public static void main(String[] args) {
    Map<String,Student> map = new HashMap<>();
    map.put("3",new Student("3","张三"));
    map.put("4",new Student("4","李四"));
    map.put("5",new Student("5","王五"));
    map.put("6",new Student("6","赵六"));
    map.put("7",new Student("7","钱七"));
    MemoryRepository<Student> memoryRepository = new MemoryRepository<>(map);

    Student studentZhang = memoryRepository.get("3");
    System.out.println(studentZhang.toString());

    memoryRepository.delete("4");
    memoryRepository.update("5",new Student("5","冯五"));

    RepositoryUtil.printList(memoryRepository.list());
  }
}
