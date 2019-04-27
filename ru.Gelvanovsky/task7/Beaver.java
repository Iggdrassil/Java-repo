package ru.Gelvanovsky.task7;

public class Beaver extends Animal implements Swimmable, Runnable {
    @Override
    public void getName() {
        System.out.println("Меня зовут Бобер!");
    }

    @Override
    public void Run() {
        System.out.println("Я бобер, и я могу бегать!");
    }

    @Override
    public void Swim() {
        System.out.println("Я бобер, и я могу плавать!");
    }
}
