package ru.Gelvanovsky.task18;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Варя",20));
        people.add(new Person("Борис",440));
        people.add(new Person("Антон",12));
        people.add(new Person("Aнтон",3));
        iterate(people);
        Collections.sort(people, new PersonSuperComparator().thenComparing(new PersonAgeComparator()));
        iterate(people);
    }
    private static void iterate(List<Person> people) {
        Iterator i = people.iterator();
        while (i.hasNext()) {
            System.out.print(i.next());
            System.out.println("; ");
        }
        System.out.println();
    }
}
