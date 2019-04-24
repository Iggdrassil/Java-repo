package ru.Gelvanovsky.task5;

public enum Drinks {
    TEA("Чай"), COFFEE("Кофе"), SODA("Газировка"),
    WATER("Вода");

    private String name;
    private int cost;

    Drinks(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int setCost(int cost) {
        this.cost = cost;
        return cost;
    }

    public int getCost() {
        return cost;
    }
}
