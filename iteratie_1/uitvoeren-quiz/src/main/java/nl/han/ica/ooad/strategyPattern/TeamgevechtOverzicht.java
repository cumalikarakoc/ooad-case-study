package nl.han.ica.ooad.strategyPattern;

import nl.han.ica.ooad.Student;

public class TeamgevechtOverzicht implements Overzicht {
    @Override
    public void genereerOverzicht(int score, Student s) {
        System.out.println("Team score genereren");
    }
}
