package ru.Gelvanovsky.task3;

import java.util.Scanner;

public class DescribeOfNumber {
    public static void main(String[] args){
        System.out.println("Введи число ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if ((number%2) == 0){
            System.out.println("Число четное");
        }else {
            System.out.println("Число нечетное");
        }
        if (number == 0) {
            System.out.println("Число нулевое");
        }
        if (number > 0) {
            System.out.println("Число положительное");
        }else {
            System.out.println("Число отрицательное");
        }

    }
}
