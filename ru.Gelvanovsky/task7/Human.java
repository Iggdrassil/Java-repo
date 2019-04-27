package ru.Gelvanovsky.task7;

public abstract class Human implements HumanRunnable, HumanSwimmable{
    public abstract void name();
    public static void main(String[] args) {
        Vasya vasya = new Vasya();
        vasya.name();
        vasya.RunFast();
        vasya.RunSlow();
        vasya.SwimFast();
        vasya.SwimSlow();
        Petya petya = new Petya();
        petya.name();
        petya.RunFast();
        petya.RunSlow();
        petya.SwimFast();
        petya.SwimSlow();
    }
}
