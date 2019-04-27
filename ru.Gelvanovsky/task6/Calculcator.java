package ru.Gelvanovsky.task6;

import java.math.BigDecimal;//BigDecimal выбран, чтобы не было 3,1+4,1 = 7,19999999.., а было 3,1+4,1=7,2
import java.util.Scanner;

public class Calculcator {
    static int result;
    static BigDecimal resultToo;
    static String chooseType;
    private static int numberA;
    private static int numberB;
    private static BigDecimal numberC;
    private static BigDecimal numberD;
    private static void Addition(){
        if (chooseType.equals("целые")){
            result = getNumberA()+getNumberB();
        }
       if (chooseType.equals("дроби")){
           resultToo = getNumberC().add(getNumberD());
       }
    }
    private static void Subtraction(){
        if (chooseType.equals("целые")){
            result = getNumberA()-getNumberB();
        }
        if (chooseType.equals("дроби")){
            resultToo = getNumberC().subtract(getNumberD());
        }
    }
    private static void Division(){
        if (chooseType.equals("целые")){
            result = getNumberA()/getNumberB();
        }
        if (chooseType.equals("дроби")){
            resultToo = getNumberC().divide(getNumberD(),5);
        }
    }
    private static void Multiplication(){
        if (chooseType.equals("целые")){
            result = getNumberA()*getNumberB();
        }
        if (chooseType.equals("дроби")){
            resultToo = getNumberC().multiply(getNumberD());
        }
    }
    private static void PercentFromNumber(){
        if (chooseType.equals("целые")){
            result = (getNumberA()*getNumberB())/100;
        }
        if (chooseType.equals("дроби")){
            resultToo = (getNumberC().multiply(getNumberD())).divide(BigDecimal.valueOf(100));
        }
    }
    public static int getNumberA() {
        return numberA;
    }

    private static void ChooseAndViewAction(){
        System.out.println("Выбери действие:");
        System.out.println("Сложение  ==>> [+]");
        System.out.println("Вычитание ==>> [-]");
        System.out.println("Умножение ==>> [*]");
        System.out.println("Деление   ==>> [/]");
        System.out.println("Процент от числа ==>> [%]");
        Scanner sc = new Scanner(System.in);
        String chooseAction = sc.nextLine();
        switch (chooseAction){
            case "+":
                Calculcator.Addition();
                break;
            case "-":
                Calculcator.Subtraction();
                break;
            case "*":
                Calculcator.Multiplication();
                break;
            case "/":
                Calculcator.Division();
                break;
            case "%":
                Calculcator.PercentFromNumber();
                break;
            default:
                System.out.println("Неизвестная операция");
        }
    }

    public static int setNumberA(int numberA) {
        Calculcator.numberA = numberA;
        return numberA;
    }

    public static int getNumberB() {
        return numberB;
    }

    public static void setNumberB(int numberB) {
        Calculcator.numberB = numberB;
    }

    public static BigDecimal getNumberC() {
        return numberC;
    }

    public static void setNumberC(BigDecimal numberC) {
        Calculcator.numberC = numberC;
    }

    public static BigDecimal getNumberD() {
        return numberD;
    }

    public static void setNumberD(BigDecimal numberD) {
        Calculcator.numberD = numberD;
    }

    public static void main(String[] args) {
        System.out.println("C какими числами работать? [целые]/[дроби]");
        Scanner sc = new Scanner(System.in);
        chooseType= sc.nextLine();
        switch (chooseType){
            case "целые":
                System.out.println("Введи число A");
                int enteredNumber = sc.nextInt();
                setNumberA(enteredNumber);
                System.out.println("Введи число B");
                int enteredNumberTwo = sc.nextInt();
                setNumberB(enteredNumberTwo);
                Calculcator.ChooseAndViewAction();
                System.out.println(result);
                sc.close();
                break;
            case "дроби":
                System.out.println("Введи число A");
                BigDecimal enteredNumberForDouble = sc.nextBigDecimal();
                setNumberC(enteredNumberForDouble);
                System.out.println("Введи число B");
                BigDecimal enteredNumberTwoForDouble = sc.nextBigDecimal();
                setNumberD(enteredNumberTwoForDouble);
                Calculcator.ChooseAndViewAction();
                System.out.println(resultToo);
                sc.close();
                break;
            default:
                System.out.println("Нет такого значения");
        }
        }
    }
