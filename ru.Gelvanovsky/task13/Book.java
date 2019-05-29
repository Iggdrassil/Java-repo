package ru.Gelvanovsky.task13;

import java.io.Serializable;

public class Book implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nameOfBook;
    private String authorOfBook;
    private String publicationDate;

    public Book(String nameOfBook, String authorOfBook,String publicationDate) {
        this.nameOfBook = nameOfBook;
        this.authorOfBook = authorOfBook;
        this.publicationDate = publicationDate;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public String getAuthorOfBook() {
        return authorOfBook;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    @Override
    public String toString() {
        return "\nКнига -->> "+
                "Название: "+getNameOfBook()+";"+
                " Автор: "+getAuthorOfBook()+";"+
                " Год издания: "+getPublicationDate()+";";
    }
}
