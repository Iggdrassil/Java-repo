package ru.Gelvanovsky.task2;

import java.util.Scanner;

public class CountingPriceOfPetrolWithInteract {
    public static void main(String[] args){
        System.out.print("Введи цену за один литра бензина -->> ");
        Scanner in = new Scanner(System.in);
        int costOneLitreOfPetrol = in.nextInt();
        System.out.print("Введи количество литров безина -->> ");
        int amountLitreOfPetrol =  in.nextInt();
        int costOfAmountLitreOfPetrol;
        costOfAmountLitreOfPetrol=costOneLitreOfPetrol*amountLitreOfPetrol;
        System.out.println(costOfAmountLitreOfPetrol);
    }
}
