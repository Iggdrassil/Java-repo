package ru.Gelvanovsky.task2;

import java.util.Scanner;

public class SecInHoursWithInteract {
    public static void main(String[] args) {
        System.out.print("Введи количество секунд -->> ");
        Scanner in = new Scanner(System.in);
        int seconds = in.nextInt();
        int hours;
        hours = seconds / 3600;
        System.out.println("Полных часов -->> " + hours);
    }
}