package ru.Gelvanovsky.task4;
/*Центурион расширяет класс Sodier и имеет зарплату*/
public class Centurion extends Soldier {
    public Centurion(String name, int age) {
        super(name, age);
    }
    private int salary;
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
