package ru.Gelvanovsky.task10;

public enum Food {
    CARROT("Морковь"), APPLE("Яблоко"), PORRIDGE("Каша");
    private String foodName;

    Food(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodName() {
        return foodName;
    }
}
