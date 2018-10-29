package nl.han.ica.ooad;


public class Overzicht {
    public void genereerOverzicht(int score, Student s) {
        System.out.println("**************\n" +
                            "Student naam : " + s.getNaam() + "\n" +
                            "score : " + score + "\n" +
                            "**************");
    }
}
