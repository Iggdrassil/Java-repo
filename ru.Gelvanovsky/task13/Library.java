package ru.Gelvanovsky.task13;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Library implements Serializable {
    static Scanner in = new Scanner(System.in);
    private static final long serialVersionUID = 3L;
    private static final File fileName = new File("HomeLibrary.bin");
    static ArrayList<Book> newBooks = new ArrayList<>();
    static ArrayList<Object> oldBooks = new ArrayList<>();
    void readLibrary(){
        try (FileInputStream listBooks = new FileInputStream(fileName);
             ObjectInputStream ois = new ObjectInputStream(listBooks)) {
            System.out.println(ois.readObject());}
        catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    void saveBook(ArrayList<Object> books){
        try (FileOutputStream addingBook = new FileOutputStream(fileName);
             ObjectOutputStream oos = new ObjectOutputStream(addingBook)) {
            oos.writeObject(oldBooks);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
    }}
     void addBook() throws IOException, ClassNotFoundException {
        System.out.println("Введи название:");
        String nameOfBook = in.nextLine();
        System.out.println("Введи автора:");
        String author = in.nextLine();
        System.out.println("Введи год:");
        String date = in.nextLine();
        if ((fileName.length()==0)==true){
            //выполнение этого условия означает, что файл пуст
            System.out.println("File is empty");
            Book bookNewWhenFileIsEmpty = new Book(nameOfBook,author,date);
            newBooks.add(bookNewWhenFileIsEmpty);//добавляем новую книгу
            oldBooks.addAll(0,newBooks);//добавляем новую книгу в массив старых
            saveBook(oldBooks);//сохраняем
        }else {
        FileInputStream book = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(book);
        Object oldData = String.valueOf(ois.readObject());
        //System.out.println(oldData);
        //System.out.println("Файл прочитан!");
        oldBooks.add(oldData);
        ois.close();
        //System.out.println("Файл прочитан!x2");
        //newBooks.addAll(0,oldBooks);//добавляем все старые книги
        Book bookNew = new Book(nameOfBook,author,date);
        oldBooks.add(bookNew);
        saveBook(oldBooks);
        }
    }
}

