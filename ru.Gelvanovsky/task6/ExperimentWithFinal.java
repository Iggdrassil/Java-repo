package ru.Gelvanovsky.task6;

public final class ExperimentWithFinal {
    private final int myFinalInt;
    private final String myFinalString;

    public ExperimentWithFinal(int myFinalInt, String myFinalString) {
        this.myFinalInt = myFinalInt;
        this.myFinalString = myFinalString;
    }

    public static final void main(String[] args) {
        System.out.println(new ExperimentWithFinal(3,"I'm String!"));
    }

    @Override
    public final String toString() {
        return "ExperimentWithFinal{" +
                "myFinalInt=" + myFinalInt +
                ", myFinalString='" + myFinalString + '\'' +
                '}';
    }
}
