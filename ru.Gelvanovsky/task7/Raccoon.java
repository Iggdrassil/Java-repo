package ru.Gelvanovsky.task7;

public class Raccoon extends Animal implements Swimmable, Runnable{
    @Override
    public void getName() {
        System.out.println("Меня зовут Енот!");
    }

    @Override
    public void Run() {
        System.out.println("Я енот, и могу бегать!");
    }

    @Override
    public void Swim() {
        System.out.println("Я енот, и я могу тоже плавать, как Бобер");
    }
}
