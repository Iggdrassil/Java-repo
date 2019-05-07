package ru.Gelvanovsky.task5.task5_Corrected;

import java.util.Scanner;

public class ApplicationCorrected {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Показать меню? Y/N");
        String viewMenuOfDrinks = in.nextLine();
        if (viewMenuOfDrinks.equals("Y")){
            VendingMachineCorrected.viewMenu();
        }
        System.out.println("Ваш баланс "+ VendingMachineCorrected.getBalance());
        System.out.println("Пополнить баланс? Y/N");
        String addMoneyOnBalance = in.nextLine();
        if (addMoneyOnBalance.equals("Y")) {
            VendingMachineCorrected.addMoneyOnBalance();
        }
        VendingMachineCorrected.chooseProduct();
    }
}

