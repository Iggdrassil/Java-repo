package ru.Gelvanovsky.task21;

import java.util.Scanner;

public abstract class App {
    static Scanner in = new Scanner(System.in);
    static String userChoise;
    static Shop shop = new Shop();
    static int stopAdd = 0;
    static int stopApp = 1;
    public static void userChoiseUpperAndTrim(){
        userChoise = userChoise.toUpperCase();
        userChoise = userChoise.trim();
    }
    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println("Меню --> [М]");
        while (stopApp != 0){
            System.out.println("======================================");
            userChoise = in.nextLine();
            userChoiseUpperAndTrim();
            switch (userChoise){
                case "Д":
                    while (stopAdd !=1 ){
                        Scanner scannerForAdd = new Scanner(System.in);
                        System.out.println("Введите название товара");
                        userChoise = scannerForAdd.nextLine();
                        System.out.println("Введите количество товара");
                        int quantity = in.nextInt();
                        shop.addProduct(userChoise,quantity);
                        System.out.println("Продолжить покупки? Д/Н");
                        userChoise = scannerForAdd.nextLine();
                        userChoiseUpperAndTrim();
                        if (userChoise.equals("Н")){
                            stopAdd++;
                            System.out.println("Добавление товаров завершено");
                    }
                    }
                    break;
                case "С":
                    shop.getProducts();
                    break;
                case "У":
                    System.out.println("Удалить [О]дин или [В]се?");
                    userChoise = in.nextLine();
                    userChoiseUpperAndTrim();
                    if (userChoise.equals("О")){
                        System.out.println("Введите навзвание продукта");
                        userChoise = in.nextLine();
                        shop.removeProduct(userChoise);
                    }else {
                        shop.clear();
                        System.out.println("Все товары удалены");
                    }
                    break;
                case "П":
                    System.out.println("Введите навзвание продукта");
                    userChoise = in.nextLine();
                    System.out.println("Введите новое количество товара");
                    int quantity = in.nextInt();
                    shop.updateProductQuantity(userChoise,quantity);
                    break;
                case "И":
                    System.out.println("Введите навзвание продукта");
                    userChoise = in.nextLine();
                    shop.getProductQuantity(userChoise);
                    break;
                case "М":
                    showMenu();
                    break;
                case "З":
                    stopApp--;
                    in.close();
                    System.out.println("Программа завершена");
                    break;
                default:
                    System.out.println("Неизвестное действие");
            }
        }
    }

    private static void showMenu() {
        System.out.println("Выберите действие");
        System.out.println("[Д]обавить товар");
        System.out.println("[У]далить товар");
        System.out.println("[П]оменять количество товара");
        System.out.println("[С]писок товаров");
        System.out.println("[И]тоговое количество товара");
        System.out.println("[З]авершить программу");
        System.out.println("[М]еню");
    }
}
