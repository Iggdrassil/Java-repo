package ru.Gelvanovsky.task6;

import java.time.LocalDate;

public class AgreementToDocumentConverter {
    public static Document convert(Agreement firstAgreement) {
        Document conv = new Document(firstAgreement.getNumberOfAgreement(), firstAgreement.getDateOfAgreement(),
                firstAgreement.getListOfProducts());
        return conv;
    }
}
