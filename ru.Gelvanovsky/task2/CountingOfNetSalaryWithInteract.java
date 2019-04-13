package ru.Gelvanovsky.task2;

import java.util.Scanner;

public class CountingOfNetSalaryWithInteract {
    public static void main(String[] args){
        System.out.print("Введи зарплату ДО вычета НДФЛ -->> ");
        Scanner in = new Scanner(System.in);
        int blackMoney = in.nextInt();
        int percentOfPersonalIncomeTax = 13;
        int grayMoney;
        int whiteMoney;
        grayMoney=blackMoney*percentOfPersonalIncomeTax/100;
        whiteMoney=blackMoney-grayMoney;
        System.out.println("Зарплата после вычета НДФЛ -->> "+whiteMoney);
}
}
