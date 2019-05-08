package ru.Gelvanovsky.task8;

public class Сensor {
    public static void main(String[] args) {
        String enteredStr = "Привет, бяка! Бяка с большой буквы, бяка с маленькой буквы.";
        enteredStr = enteredStr.toLowerCase();
        enteredStr = enteredStr.replace("бяка","[Вырезано цензурой]");
        enteredStr = enteredStr.substring(0,1).toUpperCase()+enteredStr.substring(1);
        System.out.println(enteredStr);
    }
}
