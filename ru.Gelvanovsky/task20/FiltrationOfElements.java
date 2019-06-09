package ru.Gelvanovsky.task20;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class FiltrationOfElements {
    public static Set<String> removeEvenLength(Set<String> set) {
        String[] strings = set.toArray(new String[0]);
        System.out.println(Arrays.toString(strings));
        for (String x:strings) {
            int data = x.length();
            if (data%2==0){
            }else {
                System.out.print(x+" ");
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Set<String>stringSet = new LinkedHashSet<>();
        stringSet.add("Word");
        stringSet.add("Wor");
        stringSet.add("Wo");
        stringSet.add("W");
        stringSet.add("Wordd");
        stringSet.add("Worddd");
       /* for (String x:stringSet) {
            System.out.print(x+" ");
        }*/
       removeEvenLength(stringSet);

    }
}
