package ru.Gelvanovsky.task4;

public class LegionStructure {
    private String sequenceNumber;

    public String getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    @Override
    public String toString() {
        return "LegionStructure{" +
                "sequenceNumber='" + sequenceNumber + '\'' +
                '}';
    }
}
