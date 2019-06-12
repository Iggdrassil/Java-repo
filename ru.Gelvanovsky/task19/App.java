package ru.Gelvanovsky.task19;

import java.util.Scanner;

public abstract class App {
    static Scanner in = new Scanner(System.in);
    static String userChoise;
    static Shop shop = new Shop();
    static int stopAdd = 0;
    static int productCount = 0;//прибавляется с каждым новым продуктом
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
                    addProduct();
                    break;
                case "У":
                    deleteProduct();
                    break;
                case "П":
                    updateQuantity();
                    break;
                case "С":
                    getProducts();
                    break;
                case "И":
                    getProductsQuantitys();
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

    private static void getProductsQuantitys() {
        System.out.println("Введите название товара, для которого показать количество");
        userChoise = in.nextLine();
        if (shop.products.contains(userChoise) == true){
            shop.getProductQuantity(userChoise);
        }else {
            System.out.println("Нет такого товара");
        }
    }

    private static void getProducts() {
        System.out.println("Товары в корзине, всего ["+productCount+"]");
        shop.getProducts();
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

    private static void updateQuantity() {
         System.out.println("Введите название товара");
        userChoise = in.nextLine();
        if (shop.products.contains(userChoise) == true){
            System.out.println("Введите номер товара");
            int productNumber = in.nextInt()-1;
            int oldQuantity = shop.quantitys.get(productNumber);
            System.out.println("Введите новое количество");
            int newQuantity = in.nextInt();
            shop.quantitys.set(productNumber,newQuantity);
            shop.updateProductQuantity(userChoise, newQuantity);
            System.out.println("Количество товара ["+userChoise+"] успешно изменено с " +
                    "["+oldQuantity+"] на ["+newQuantity+"]");
        }else {
            System.out.println("Нет такого товара");
        }
    }

    private static void deleteProduct() {
        System.out.println("Удалить один товар или все? [О]дин/[В]се");
        userChoise = in.nextLine();
        userChoiseUpperAndTrim();
        if (userChoise.equals("О")){
            System.out.println("Введите название товара");
            userChoise = in.nextLine();
            if (shop.products.contains(userChoise) == true){
                System.out.println("Введите номер товара");
                int productNumber = in.nextInt()-1;
                shop.quantitys.remove(productNumber);
                shop.removeProduct(userChoise);
                productCount--;
                System.out.println("-----------");
                System.out.println("Товар ["+userChoise+"] удален");
                System.out.println("-----------");
                shop.getProducts();
            }else {
                System.out.println("Нет такого товара");
            }
        }else {
            shop.clear();
            productCount = 0;
            System.out.println("Все товары удалены");
        }
    }

    private static void addProduct() {
        while (stopAdd != 1) {
            Scanner scannerForAdd = new Scanner(System.in);
            System.out.println("Введите название товара");
            String productName = scannerForAdd.nextLine();
            System.out.println("Введи количество товара");
            int quantity = scannerForAdd.nextInt();
            shop.addProduct(productName, quantity);
            productCount++;
            System.out.println("Товар ["+productName+"] добавлен под номером ["+productCount+"]");
            System.out.println("Продолжить добавление товаров? Д/Н");
            userChoise = scannerForAdd.next();
            userChoiseUpperAndTrim();
            if (userChoise.equals("Н")) {
                stopAdd++;
                System.out.println("Добавление товаров завершено");
                //scannerForAdd.close();
            }
        }
    }
}
