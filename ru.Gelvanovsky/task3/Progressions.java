package ru.Gelvanovsky.task3;

import java.util.Scanner;

public class Progressions {
    private static String enteredValue;
    public static void main(String[] args) {
        System.out.println("Введи какую прогрессию показать: арифметическую или геометрическую");
        Scanner in = new Scanner(System.in);
        enteredValue = in.nextLine();
        String chooseProgression = enteredValue.toLowerCase();
        chooseProgression = chooseProgression.trim();
        switch (chooseProgression){
            case "арифметическая":
                System.out.println("Выбрана арифметическая прогрессия");
                System.out.println("Введи количество элементов в прогрессии");
                int amountOfElements = in.nextInt();
                System.out.println("Введи шаг прогрессии");
                int aProgressionStep = in.nextInt();
                System.out.println("Введи начальный элемент прогрессии");
                int firstElementOfProgression = in.nextInt();
                int arrayOfElements[];
                arrayOfElements = new int[amountOfElements];
                arrayOfElements[0] = firstElementOfProgression;
                for (int i=1; i <arrayOfElements.length-1;i++){
                    arrayOfElements[i] = arrayOfElements[i-1] + aProgressionStep;
                    System.out.println(arrayOfElements[i]);
                }
                break;
            case "геометрическая":
                System.out.println("Выбрана геометрическая прогрессия");
                System.out.println("Введи количество элементов в прогрессии");
                int amountOfElementsGProgression = in.nextInt();
                System.out.println("Введи шаг прогрессии");
                int gProgressionStep = in.nextInt();
                System.out.println("Введи начальный элемент прогрессии");
                int firstElementOfGProgression = in.nextInt();
                in.close();
                int arrayOfElementsGProgression[];
                arrayOfElementsGProgression = new int[amountOfElementsGProgression];
                arrayOfElementsGProgression[0] = firstElementOfGProgression;
                for (int i=1; i <arrayOfElementsGProgression.length-1;i++){
                    arrayOfElementsGProgression[i] = arrayOfElementsGProgression[i-1] * gProgressionStep;
                    System.out.println(arrayOfElementsGProgression[i]);
                }
                break;
             default:{
                 System.out.println("Выбери либо арифметическую, либо геометрическую прогрессию");
             }
        }
    }
}