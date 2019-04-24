package ru.Gelvanovsky.task5;

public class VendingMachine {
    private static int balance;
    //private int balance = 0;

    public static int getBalance() {
        return balance;
    }

    public static void setBalance(int balance) {
        VendingMachine.balance = balance;
    }

    public static void main(String[] args) {

        System.out.println(VendingMachine.getBalance());
    }
}
