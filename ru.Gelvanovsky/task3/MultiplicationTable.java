package ru.Gelvanovsky.task3;

public class MultiplicationTable {
    public static void main(String[] args){
        for (int i = 1; i < 11; i++) {
            for (int x = 1; x < 11; x++) {
                System.out.print(x * i + " ");
            }
            System.out.println(" ");
        }
    }
}
