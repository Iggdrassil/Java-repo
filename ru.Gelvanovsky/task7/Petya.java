package ru.Gelvanovsky.task7;

public class Petya extends Human {
    @Override
    public void RunFast() {
        System.out.println("Я бегаю быстрее, чем Вася");
    }

    @Override
    public void RunSlow() {
        System.out.println("Я бегаю медленнее, чем Вася влавает!");
    }

    @Override
    public void name() {
        System.out.println("Я Петя");
    }

    @Override
    public void SwimFast() {
        System.out.println("Я плаваю медленнее, чем Вася");
    }

    @Override
    public void SwimSlow() {
        System.out.println("Я плаваю медленнее, чем Вася бегает!");
    }
}
