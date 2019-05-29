package ru.Gelvanovsky.task13;

import java.io.*;
import java.util.Scanner;

public class App implements Serializable {
    private static final long serialVersionUID = 2L;
    //private static final String fileName = "HomeLibrary.bin";
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Library library = new Library();
        System.out.println("Выберите действие:");
        System.out.println("[Д]обавить книги");
        System.out.println("[П]оказать список существующих книг");
        String userChoise = in.nextLine();
        userChoise = userChoise.toUpperCase();
        userChoise = userChoise.trim();
        if (userChoise.equals("Д")) {
            library.addBook();
            System.out.println("Книги добавлены");
        }
        if (userChoise.equals("П")){
            library.viewBooksInLibray();}
    }
}