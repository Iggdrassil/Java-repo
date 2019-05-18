package ru.Gelvanovsky.task11;

import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.Scanner;

public class VendingMachine {
    private static final Logger VendingMachineLogger = Logger.getLogger(VendingMachine.class);
    private static int balance;
    private static int productCost;
    private static String productName;

    public static String getProductName() {
        return productName;
    }

    public static void setProductName(String productName) {
        VendingMachine.productName = productName;
    }

    public static int getProductCost() {
        return productCost;
    }

    public static void setProductCost(int productCost) {
        VendingMachine.productCost = productCost;
    }

    public static int getBalance() {
        return balance;
    }

    public static void setBalance(int balance) {
        VendingMachine.balance = balance;
    }


    public static void chooseProduct() {
        Drinks[] drinks = Drinks.values();
        Scanner in = new Scanner(System.in);
        printProduct();
        int chooseProduct = in.nextInt()-1;
        if (chooseProduct<0 || chooseProduct>=drinks.length){
            VendingMachineLogger.info("Запрос несуществующего товара");
            System.out.println("Нет такого товара");
        }else {
            VendingMachine.setProductName(drinks[chooseProduct].getName());
            VendingMachine.setProductCost(drinks[chooseProduct].getCost());
            VendingMachine.buyProduct();
        }
    }

    public static void buyProduct(){
        if (VendingMachine.getBalance() >= VendingMachine.getProductCost()) {
            int res = VendingMachine.getBalance() - VendingMachine.getProductCost();
            System.out.println("Ваш выбор "+ VendingMachine.getProductName()+", ваша сдача " + res);
        }else {
            VendingMachineLogger.warn("Предупреждение: попытка покупки при нехватке средств");
            System.out.println("Недостаточно средств");
        }
    }

    public static void addMoneyOnBalance(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму для внесения");
        int sumForPayment = in.nextInt();
        VendingMachine.setBalance(sumForPayment);
        System.out.println("Ваш баланс " + VendingMachine.getBalance());
    }

    static void viewMenu(){
        System.out.println(Arrays.toString(Drinks.values()));
        System.out.print(" "+ Drinks.TEA.getCost());
        System.out.print("    "+ Drinks.COFFEE.getCost());
        System.out.print("     "+ Drinks.SODA.getCost());
        System.out.println("    "+ Drinks.WATER.getCost());
    }
    public static void printProduct(){
        Drinks[] drinks = Drinks.values();
        for (int i=0; i<drinks.length;i++){
            int id = i+1;
            System.out.println(id+"=> "+drinks[i].getName()+",цена: "+drinks[i].getCost());
        }
    }
}
