package ru.Gelvanovsky.task4;
/*Центурия расширяет класс LegionStructure и имеет в себе список обычных легионеров и центурионов*/
import java.util.Arrays;

public class Сentury extends LegionStructure {
    private String sequenceNumber;
    private Centurion [] centurions = new Centurion[1];
    private JustLegionary [] legionaries = new JustLegionary[1];
    public Centurion[] getCenturions() {
        return centurions;
    }

    public void setCenturions(Centurion[] centurions) {
        this.centurions = centurions;
    }

    public JustLegionary[] getSoldiers() {
        return legionaries;
    }

    public void setSoldiers(JustLegionary[] soldiers) {
        this.legionaries = soldiers;
    }

    @Override
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    @Override
    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    @Override
    public String toString() {
        return "Сentury{" +
                "sequenceNumber='" + sequenceNumber + '\'' +
                "centurions=" + Arrays.toString(centurions) +
                ", legionaries=" + Arrays.toString(legionaries) +
                '}';
    }
}

