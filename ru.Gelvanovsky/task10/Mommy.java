package ru.Gelvanovsky.task10;

import java.util.Scanner;

public class Mommy {
    static int choosedFood;
    public static void main(String[] args){
        System.out.println("Для завершения еды напишите: 111");
        System.out.println("Выберите еду:");
        System.out.println("[1]"+Food.CARROT.getFoodName());
        System.out.println("[2]"+Food.APPLE.getFoodName());
        System.out.println("[3]"+Food.PORRIDGE.getFoodName());
        while (choosedFood != 111){
            try {
                Scanner in = new Scanner(System.in);
                choosedFood = in.nextInt();
                switch (choosedFood){
                    case 1:
                        System.out.println("Выбрана еда: "+Food.CARROT.getFoodName());
                        Kid.Eat();
                        break;
                    case 2:
                        System.out.println("Выбрана еда: "+Food.APPLE.getFoodName());
                        Kid.Eat();
                        break;
                    case 3:
                        System.out.println("Выбрана еда: "+Food.PORRIDGE.getFoodName());
                        Kid.Eat();
                        break;
                    case 111:
                        System.out.println("Процесс употребления пищи завершен");
                        break;
                    default:
                        System.out.println("Нет такой еды. Выберите из существующих.");
                }
            }catch (UnlikedFoodExeption ex){
                System.out.print("Еда не нравиться! ");
            }finally {
                System.out.println("Спасибо!");
            }
    }
}}
