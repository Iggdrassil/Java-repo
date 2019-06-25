package ru.Gelvanovsky.task22;

import java.util.*;

public class RemoveTheDuplicatesFromMap {
    public static void main(String[] args) {
        createMap();
        System.out.println(createMap());
        removeTheDuplicates(createMap());
    }
    public static Map<String, Person> createMap() {
        Map<String, Person> book = new HashMap<>();
        Person person1 = new Person(29,"Петрова","жен");
        Person person2 = new Person(34, "Сидорова", "жен");
        Person person3 = new Person(34, "Тихонова", "жен");
        Person person4 = new Person(35, "Петров", "муж");
        book.put("Key1", person1);
        book.put("Key2", person1);
        book.put("Key3", person2);
        book.put("Key4", person3);
        book.put("Key5", person4);
        book.put("Key6", person4);
        return book;
    }
    public static void removeItemFromMapByValue(Map<String, Person> map, Person value) {
        Map<String, Person> copy = new HashMap<>(map);
        for (Map.Entry<String, Person> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
    public static void removeTheDuplicates(Map<String, Person> map){
       Map <String, Person> testMap = new HashMap<>(map);
       for (Map.Entry<String, Person> personEntry : testMap.entrySet()) {
           //System.out.println(personEntry.getValue());
           if (map.containsValue(personEntry.getValue())) {
               //System.out.println(personEntry.getKey() +" "+ personEntry.getValue());
               //System.out.println(map.get(personEntry.getKey()));
               int count = Collections.frequency(map.values(), personEntry.getValue());
               if (count>1){
                   removeItemFromMapByValue(map,personEntry.getValue());
               }
           }
       }
        System.out.println(map);
    }
}
