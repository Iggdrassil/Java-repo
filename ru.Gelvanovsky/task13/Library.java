package ru.Gelvanovsky.task13;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Library implements Serializable {
    private static final long serialVersionUID = 3L;
    private static final File fileName = new File("HomeLibrary.bin");
    void addBook() {
        ArrayList<Book>books = new ArrayList<>();
        books.add(new Book("Книга1","Автор1","1990"));
        books.add(new Book("Книга2","Автор2","1992"));
        books.add(new Book("Книга3","Автор3","1993"));
        books.add(new Book("Книга4","Автор4","1994"));
        books.add(new Book("Книга5","Автор5","1995"));
        books.add(new Book("Книга6","Автор6","1996"));
        books.add(new Book("Книга7","Автор7","1997"));
        try (FileOutputStream addingBook = new FileOutputStream(fileName);
             ObjectOutputStream oos = new ObjectOutputStream(addingBook)) {
              oos.writeObject(books);
              oos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
                        e.printStackTrace();
        }
    }
    void viewBooksInLibray(){
        try (FileInputStream listBooks = new FileInputStream(fileName);
             ObjectInputStream ois = new ObjectInputStream(listBooks)) {
            //System.out.println(ois.readUTF());
            System.out.println(ois.readObject());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
