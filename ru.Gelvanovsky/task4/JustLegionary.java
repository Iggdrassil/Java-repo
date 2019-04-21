package ru.Gelvanovsky.task4;
/*Обычный легионер расширяет класс Soldier и имеет свой номер в строю*/
public class JustLegionary extends Soldier {
    public JustLegionary(String name, int age) {
        super(name, age);
    }
    private int numberInForm;
    public int getNumberInForm() {
        return numberInForm;
    }

    public void setNumberInForm(int numberInForm) {
        this.numberInForm = numberInForm;
    }
}
