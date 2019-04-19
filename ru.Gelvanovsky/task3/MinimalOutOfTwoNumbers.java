package ru.Gelvanovsky.task3;

import java.util.Scanner;

public class MinimalOutOfTwoNumbers {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введи два числа");
        int enteredNumberOne = in.nextInt();
        int enteredNumberTwo = in.nextInt();
        if (enteredNumberOne > enteredNumberTwo){
            System.out.println("Больше число "+enteredNumberOne);
        }
        if (enteredNumberOne < enteredNumberTwo) {
            System.out.println("Больше число "+enteredNumberTwo);
        }
    }
}
