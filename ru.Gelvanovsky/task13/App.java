package ru.Gelvanovsky.task13;

import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

public class App implements Serializable {
    private static final long serialVersionUID = 2L;
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Library library = new Library();
        System.out.println("[Д]обавить книгу");
        System.out.println("[П]росмотреть существующие книги");
        String userChoise = in.nextLine();
        userChoise = userChoise.toUpperCase();
        userChoise = userChoise.trim();
        if (userChoise.equals("Д")) {
            library.addBook();
            System.out.println("Книга добавлена");
        }
        if (userChoise.equals("П")){
            library.readLibrary();}
    }
}