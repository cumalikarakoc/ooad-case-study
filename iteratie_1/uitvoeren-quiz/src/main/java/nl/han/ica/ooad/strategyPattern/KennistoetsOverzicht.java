package nl.han.ica.ooad.strategyPattern;

import nl.han.ica.ooad.Student;

public class KennistoetsOverzicht implements Overzicht {
    @Override
    public void genereerOverzicht(int score, Student s) {
        System.out.println("**************\n" +
                "Student naam : " + s.getNaam() + "\n" +
                "score : " + score + "\n" +
                "**************");
    }
}
