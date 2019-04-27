package ru.Gelvanovsky.task7;

public abstract class Animal {
    public abstract void getName();

    public static void main(String[] args) {
        Beaver justBeaver = new Beaver();
        justBeaver.getName();
        justBeaver.Run();
        justBeaver.Swim();
        Raccoon justRaccoon = new Raccoon();
        justRaccoon.getName();
        justRaccoon.Run();
        justRaccoon.Swim();
        Raven justRaven = new Raven();
        justRaven.getName();
        justRaven.flying();
    }
}
