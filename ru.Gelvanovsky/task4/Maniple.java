package ru.Gelvanovsky.task4;
/*Манипула расширяет класс LegionStructure и имеет в себе список центурий*/
import java.util.Arrays;

public class Maniple extends LegionStructure{
    private String sequenceNumber;
    public Сentury[] getСenturys() {
        return Сenturys;
    }

    public void setСenturys(Сentury[] сenturys) {
        Сenturys = сenturys;
    }

    private Сentury [] Сenturys = new Сentury[1];

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
        return "Maniple{" +
                "sequenceNumber='" + sequenceNumber + '\'' +
                "Сenturys=" + Arrays.toString(Сenturys) +
                '}';
    }
}
