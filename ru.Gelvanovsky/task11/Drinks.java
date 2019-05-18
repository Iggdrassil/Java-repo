package ru.Gelvanovsky.task11;

public enum Drinks {
    TEA("Чай",40), COFFEE("Кофе",100), SODA("Газировка",50),
    WATER("Вода",10);

    private String name;
    private int cost;

    Drinks(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }
}
