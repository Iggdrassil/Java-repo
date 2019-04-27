package ru.Gelvanovsky.task7;

public class Raven extends Animal implements Flyable {
    @Override
    public void getName() {
        System.out.println("Меня зовут Ворон!");
    }

    @Override
    public void flying() {
        System.out.print("Я ворон, и я могу летать!");
    }
}
