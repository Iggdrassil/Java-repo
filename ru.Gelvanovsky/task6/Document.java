package ru.Gelvanovsky.task6;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Document {
    private int numberOfDocument;
    private LocalDate dateOfDocument = LocalDate.now();
    private String[] listOfProductsInDocument;


    public Document(int numberOfDocument, LocalDate now, java.lang.String[] strings) {
        this.numberOfDocument = numberOfDocument;
        this.dateOfDocument = dateOfDocument;
        this.listOfProductsInDocument = strings;
    }

    public static void main(String[] args) {
        Agreement firstAgreement = new Agreement(1,LocalDate.now(),new String[]{"Хлеб","Варенье"});
        System.out.println(AgreementToDocumentConverter.convert(firstAgreement));
    }

    @Override
    public String toString() {
        return "Document{" +
                "numberOfDocument=" + numberOfDocument +
                ", dateOfDocument=" + dateOfDocument +
                ", listOfProductsInDocument=" + Arrays.toString(listOfProductsInDocument) +
                '}';
    }
}
