package ru.Gelvanovsky.task18;

import java.util.Comparator;

public class PersonSuperComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        //o1.getAge() - o2.getAge();
        //o1.getName().compareTo(o2.getName());
        return o1.getName().compareTo(o2.getName());
    }
}
class PersonAgeComparator implements Comparator<Person>{
    public int compare(Person o1, Person o2){
        return o1.getAge() - o2.getAge();
    }
}
