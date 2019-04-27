package ru.Gelvanovsky.task6;

import java.time.LocalDate;
import java.util.Arrays;

public class Agreement {
    private int numberOfAgreement;
    private LocalDate dateOfAgreement = LocalDate.now();
    private String listOfProducts[];

    //Agreement firstAgreement = new Agreement(1,dateOfAgreement, new String[]{"Чай", "Кофе", "Сахар"});

    public Agreement(int numberOfAgreement, LocalDate dateOfAgreement, String[] listOfProducts) {
        this.numberOfAgreement = numberOfAgreement;
        this.dateOfAgreement = dateOfAgreement;
        this.listOfProducts = listOfProducts;
    }

    public int getNumberOfAgreement() {
        return numberOfAgreement;
    }

    public void setNumberOfAgreement(int numberOfAgreement) {
        this.numberOfAgreement = numberOfAgreement;
    }

    public LocalDate getDateOfAgreement() {
        return dateOfAgreement;
    }

    public void setDateOfAgreement(LocalDate dateOfAgreement) {
        this.dateOfAgreement = dateOfAgreement;
    }

    public String[] getListOfProducts() {
        return listOfProducts;
    }

    public void setListOfProducts(String[] listOfProducts) {
        this.listOfProducts = listOfProducts;
    }
}
