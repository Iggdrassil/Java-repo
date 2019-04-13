package ru.Gelvanovsky.task2;

import java.util.Random;
import java.util.Scanner;

public class HotCold {

    public static void main(String [] args){
        Random rnd = new Random();// Инициализация генератора случайных чисел
        int max = 100;
        int min = 0;
        int divineNumber = 0;
        int thinkedOfANumber = min + rnd.nextInt(max - min + 1);// Получение случайного числа
        //System.out.println(thinkedOfANumber);

        do {
            System.out.print("Угадай число -->> ");
            Scanner in = new Scanner(System.in);
            divineNumber = in.nextInt();
            if (divineNumber > thinkedOfANumber){
                System.out.println("Холодно!");
            }
            if (divineNumber < thinkedOfANumber){
                System.out.println("Горячо!");
            }
        }
        while (divineNumber != thinkedOfANumber);
        System.out.println("Gotcha! Загаданное число -->> "+thinkedOfANumber);
    }
}

