package ru.Gelvanovsky.task11;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class Application {
    private static final Logger AppLogger = Logger.getLogger(Application.class);
    public static void main(String[] args) {
        AppLogger.info("Новая сессия");
        Scanner in = new Scanner(System.in);
        System.out.println("Показать меню? Y/N");
        String viewMenuOfDrinks = in.nextLine();
        if (viewMenuOfDrinks.equals("Y")){
            VendingMachine.viewMenu();
        }
        System.out.println("Ваш баланс "+ VendingMachine.getBalance());
        System.out.println("Пополнить баланс? Y/N");
        String addMoneyOnBalance = in.nextLine();
        if (addMoneyOnBalance.equals("Y")) {
            VendingMachine.addMoneyOnBalance();
        }
        VendingMachine.chooseProduct();
    }
}

