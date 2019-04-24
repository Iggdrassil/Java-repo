package ru.Gelvanovsky.task5;


import java.util.Arrays;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Показать меню? Y/N");
        String viewMenuOfDrinks = in.nextLine();
        if (viewMenuOfDrinks.equals("Y")) {
            System.out.println(Arrays.toString(Drinks.values()));
            int costOFTea = Drinks.TEA.setCost(40);
            int costOFCoffee = Drinks.COFFEE.setCost(100);
            int costOFSoda = Drinks.SODA.setCost(50);
            int costOFWater = Drinks.WATER.setCost(10);
            System.out.print(" "+Drinks.TEA.getCost());
            System.out.print("    "+Drinks.COFFEE.getCost());
            System.out.print("     "+Drinks.SODA.getCost());
            System.out.println("    "+Drinks.WATER.getCost());
        }
        System.out.println("Ваш баланс "+VendingMachine.getBalance());
        System.out.println("Пополнить баланс? Y/N");
        String addMoneyOnBalance = in.nextLine();
        if (addMoneyOnBalance.equals("Y")) {
            System.out.println("Введите сумму для внесения");
            int sumForPayment = in.nextInt();
            VendingMachine.setBalance(sumForPayment);
            System.out.println("Ваш баланс " + VendingMachine.getBalance());
        }
        System.out.println("Выберите товар");
        System.out.println("1 => "+ Drinks.TEA.getName());
        System.out.println("2 => "+ Drinks.COFFEE.getName());
        System.out.println("3 => "+ Drinks.SODA.getName());
        System.out.println("4 => "+ Drinks.WATER.getName());
        int chooseProduct = in.nextInt();
        switch (chooseProduct){
            case 1:
                if (VendingMachine.getBalance()>=Drinks.TEA.getCost()){
                    System.out.println("Вы выбрали "+Drinks.TEA.getName());
                    System.out.println("Заберите товар");
                    int change = VendingMachine.getBalance()-Drinks.TEA.getCost();
                    System.out.println("Ваша сдача "+change);
                }
                if (VendingMachine.getBalance()<Drinks.TEA.getCost()){
                    System.out.println("Недостаточно средств");
                }
            case 2:
                if (VendingMachine.getBalance()>=Drinks.COFFEE.getCost()){
                    System.out.println("Вы выбрали "+Drinks.COFFEE.getName());
                    System.out.println("Заберите товар");
                    int change = VendingMachine.getBalance()-Drinks.COFFEE.getCost();
                    System.out.println("Ваша сдача "+change);
                }
                if (VendingMachine.getBalance()<Drinks.COFFEE.getCost()){
                    System.out.println("Недостаточно средств");
                }
            case 3:
                if (VendingMachine.getBalance()>=Drinks.SODA.getCost()){
                    System.out.println("Вы выбрали "+Drinks.SODA.getName());
                    System.out.println("Заберите товар");
                    int change = VendingMachine.getBalance()-Drinks.SODA.getCost();
                    System.out.println("Ваша сдача "+change);
                }
                if (VendingMachine.getBalance()<Drinks.SODA.getCost()){
                    System.out.println("Недостаточно средств");
                }
            case 4:
                if (VendingMachine.getBalance()>=Drinks.WATER.getCost()){
                    System.out.println("Вы выбрали "+Drinks.WATER.getName());
                    System.out.println("Заберите товар");
                    int change = VendingMachine.getBalance()-Drinks.WATER.getCost();
                    System.out.println("Ваша сдача "+change);
                }
                if (VendingMachine.getBalance()<Drinks.WATER.getCost()){
                    System.out.println("Недостаточно средств");
                }
            default:
                System.out.println("Нет такого товара");
        }
    }
}

