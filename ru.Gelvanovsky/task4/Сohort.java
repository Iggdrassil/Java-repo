package ru.Gelvanovsky.task4;
/*Когорта расширяет класс LegionStructure и имеет в себе список манипул*/
import java.util.Arrays;

public class Сohort extends LegionStructure{
    private String sequenceNumber;
    private Maniple[] maniples = new Maniple[1];

    public Maniple[] getManiples() {
        return maniples;
    }

    public void setManiples(Maniple[] maniples) {
        this.maniples = maniples;
    }
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }
    @Override
    public String toString() {
        return "Сohort{" +
                "sequenceNumber='" + sequenceNumber + '\'' +
                "maniples=" + Arrays.toString(maniples) +
                '}';
    }


}
