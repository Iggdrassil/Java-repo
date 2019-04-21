package ru.Gelvanovsky.task4;
/*Главный класс*/
import java.util.Arrays;

public class RomanLegion {
    private String legionTitle;

    public String getLegionTitle() {
        return legionTitle;
    }

    public void setLegionTitle(String legionTitle) {
        this.legionTitle = legionTitle;
    }
    private void legionTitle(String name) {
    }
    private Сohort [] cohorts = new Сohort[1];

    public Сohort[] getCohots() {
        return cohorts;
    }

    public void setCohots(Сohort[] cohots) {
        this.cohorts = cohots;
    }

    @Override
    public String toString() {
        return "RomanLegion{" +
                "legionTitle='" + legionTitle + '\'' +
                ", cohorts=" + Arrays.toString(cohorts) +
                '}';
    }

    public static void main(String[] args) {
        JustLegionary Dion = new JustLegionary("Dion", 35);
        Dion.setNumberInForm(8);
        Centurion Mark = new Centurion("Mark", 44);
        Mark.setSalary(500);
        Сentury centuryNumber15 = new Сentury();
        centuryNumber15.setSequenceNumber("Пятнадцатая центурия второй манипулы третьей когорты");
        centuryNumber15.setCenturions(new Centurion[]{Mark});
        centuryNumber15.setSoldiers(new JustLegionary[]{Dion});
        Maniple manipleNumber2 = new Maniple();
        manipleNumber2.setSequenceNumber("Вторая манипула третьей когорты");
        manipleNumber2.setСenturys(new Сentury[]{centuryNumber15});
        Сohort cohortNumber3 = new Сohort();
        cohortNumber3.setSequenceNumber("Третья когорта девятого легиона");
        cohortNumber3.setManiples(new Maniple[]{manipleNumber2});
        RomanLegion ninthLegion = new RomanLegion();
        ninthLegion.setLegionTitle("Девятый Итальянский легион");
        ninthLegion.setCohots(new Сohort[]{cohortNumber3});
        System.out.println(ninthLegion);
    }
}
