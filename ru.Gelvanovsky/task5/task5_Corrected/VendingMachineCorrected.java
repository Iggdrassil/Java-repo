package ru.Gelvanovsky.task5.task5_Corrected;

import java.util.Arrays;
import java.util.Scanner;
public class VendingMachineCorrected {
    private static int balance;
    private static int productCost;
    private static String productName;

    public static String getProductName() {
        return productName;
    }

    public static void setProductName(String productName) {
        VendingMachineCorrected.productName = productName;
    }

    public static int getProductCost() {
        return productCost;
    }

    public static void setProductCost(int productCost) {
        VendingMachineCorrected.productCost = productCost;
    }

    public static int getBalance() {
        return balance;
    }

    public static void setBalance(int balance) {
        VendingMachineCorrected.balance = balance;
    }


    public static void chooseProduct() {
        Scanner in = new Scanner(System.in);
        System.out.println("1 => " + DrinksCorrected.TEA.getName());
        System.out.println("2 => " + DrinksCorrected.COFFEE.getName());
        System.out.println("3 => " + DrinksCorrected.SODA.getName());
        System.out.println("4 => " + DrinksCorrected.WATER.getName());
        int chooseProduct = in.nextInt();
        if (chooseProduct == 1) {
            VendingMachineCorrected.setProductName(DrinksCorrected.TEA.getName());
            VendingMachineCorrected.setProductCost(DrinksCorrected.TEA.getCost());
            VendingMachineCorrected.buyProduct();
        }
        if (chooseProduct == 2){
            VendingMachineCorrected.setProductName(DrinksCorrected.COFFEE.getName());
            VendingMachineCorrected.setProductCost(DrinksCorrected.COFFEE.getCost());
            VendingMachineCorrected.buyProduct();
        }
        if (chooseProduct == 3){
            VendingMachineCorrected.setProductName(DrinksCorrected.SODA.getName());
            VendingMachineCorrected.setProductCost(DrinksCorrected.SODA.getCost());
            VendingMachineCorrected.buyProduct();
        }
        if (chooseProduct == 4){
            VendingMachineCorrected.setProductName(DrinksCorrected.WATER.getName());
            VendingMachineCorrected.setProductCost(DrinksCorrected.WATER.getCost());
            VendingMachineCorrected.buyProduct();
        }
        if (chooseProduct>4){
            System.out.println("Нет такого товара");
        }
    }

    public static void buyProduct(){
        if (VendingMachineCorrected.getBalance() >= VendingMachineCorrected.getProductCost()) {
            int res = VendingMachineCorrected.getBalance() - VendingMachineCorrected.getProductCost();
            System.out.println("Ваш выбор "+VendingMachineCorrected.getProductName()+", ваша сдача " + res);
        }else {
            System.out.println("Недостаточно средств");
        }
    }

    public static void addMoneyOnBalance(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму для внесения");
        int sumForPayment = in.nextInt();
        VendingMachineCorrected.setBalance(sumForPayment);
        System.out.println("Ваш баланс " + VendingMachineCorrected.getBalance());
    }

    static void viewMenu(){
        System.out.println(Arrays.toString(DrinksCorrected.values()));
        System.out.print(" "+ DrinksCorrected.TEA.getCost());
        System.out.print("    "+ DrinksCorrected.COFFEE.getCost());
        System.out.print("     "+ DrinksCorrected.SODA.getCost());
        System.out.println("    "+ DrinksCorrected.WATER.getCost());
    }

}
