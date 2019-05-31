package ru.Gelvanovsky.task15;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CashVoucher {
    static double cost;
    static int count;
    static double result;
    static double total;
    public static void main(String[] args) throws IOException {
        System.out.printf("Наименование            Цена     Кол-во      Полная стоимость%n");
        System.out.printf("-------------------------------------------------------------");
        FileReader fileReader = new FileReader("Purchases.txt");
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNext()){
            if (scanner.hasNextInt()) {
                int data = scanner.nextInt();
                count = data;
                result = count*cost;
                total +=count*cost;
                System.out.printf("%d             %5.2f",data,result);
            }else
            if (scanner.hasNextDouble()){
                double data = scanner.nextDouble();
                cost = data;
                System.out.printf("%4.2f       ",data);
            }else{
                String data = scanner.next();
                System.out.printf("%n%-23s",data);
            }
        }
        System.out.printf("%n-------------------------------------------------------------%n");
        System.out.printf("Итого: "+total);
}}