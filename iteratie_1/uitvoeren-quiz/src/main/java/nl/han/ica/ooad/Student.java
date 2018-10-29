package nl.han.ica.ooad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Student {
    private String naam;
    private boolean afgerond;
    private List<StudentAntwoord> antwoorden = new ArrayList<>();


    public Student(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public void toetsInvullen(Uitvoering uitvoering) {
        Scanner scanner = new Scanner(System.in);
        afgerond = false;
        List<Vraag> vraagList = uitvoering.getKennistoets().getVragen();
        while (!afgerond && !uitvoering.isTijdVerstreken()) {
            for (Vraag huidigeVraag : vraagList) {
                StudentAntwoord studentAntwoord = antwoordGevenOpVraag(scanner, huidigeVraag);
                antwoorden.add(studentAntwoord);
                if (huidigeVraag.getVraagnummer() == vraagList.size()) {
                    System.out.println("\nToets afgerond");
                    afgerond = true;
                }
            }
        }
    }

    private StudentAntwoord antwoordGevenOpVraag(Scanner scanner, Vraag huidigeVraag) {
        int vraagnummer = huidigeVraag.getVraagnummer();
        System.out.println(vraagnummer + ". " + huidigeVraag.getVraag());
        if (huidigeVraag instanceof MeerkeuzeVraag) {
            System.out.println(Arrays.toString(((MeerkeuzeVraag) huidigeVraag).getOpties()));
        }
        System.out.print("Geef aantwoord:");
        String ingevuldeAntwoord = scanner.nextLine();
        return new StudentAntwoord(vraagnummer, ingevuldeAntwoord);
    }

    public List<StudentAntwoord> getAntwoorden() {
        return antwoorden;
    }
}
