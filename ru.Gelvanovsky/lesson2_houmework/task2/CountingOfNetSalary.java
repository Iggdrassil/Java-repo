package ru.Gelvanovsky.task1.task2;

public class CountingOfNetSalary {
    public static void main(String[] args){
        int blackMoney = 70000;
        int percentOfPersonalIncomeTax = 13;
        int grayMoney;
        int whiteMoney;
        grayMoney=blackMoney*percentOfPersonalIncomeTax/100;
        whiteMoney=blackMoney-grayMoney;
        System.out.println("Зарплата после вычета НДФЛ "+whiteMoney);
    }
}
