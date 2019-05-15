package ru.Gelvanovsky.task10;

import java.util.Random;

public class Kid {
    public static void Eat() throws UnlikedFoodExeption{
        Random likedOrUnliked = new Random();
        int foodPreference = likedOrUnliked.nextInt(2);
        if (foodPreference == 0){
            System.out.println("Еда нравиться");
            System.out.println("Съел!");
        }else {
            throw new UnlikedFoodExeption("Еда не нравиться");
        }
    }
}
