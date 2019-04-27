package ru.Gelvanovsky.task7;

public class Vasya extends Human{
    @Override
    public void RunFast() {
        System.out.println("Я бегаю быстрее, чем Петя влавает!");
    }

    @Override
    public void RunSlow() {
        System.out.println("Я бегаю медленнее, чем Петя");
    }

    @Override
    public void SwimFast() {
        System.out.println("Я плаваю быстрее, чем Петя бегает!");
    }

    @Override
    public void SwimSlow() {
        System.out.println("Я плаваю медленнее, чем Петя");
    }

    @Override
    public void name() {
        System.out.println("Я Вася");
    }
}
