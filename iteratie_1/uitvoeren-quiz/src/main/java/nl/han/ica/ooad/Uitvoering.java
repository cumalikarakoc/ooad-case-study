package nl.han.ica.ooad;

import java.util.List;

public class Uitvoering {
    private Kennistoets kennistoets;
    private boolean afgerond = false;
    private boolean tijdVerstreken = false;
    private Lokaal lokaal;
    private Overzicht overzicht = new Overzicht();


    public Uitvoering(Lokaal lokaal, Kennistoets kennistoets) {
        this.lokaal = lokaal;
        this.kennistoets = kennistoets;
    }

    public void startToets() {
        for (Student s : lokaal.getStudentList()) {
            s.toetsInvullen(this);
            overzicht.genereerOverzicht(berekenTotaleScore(s), s);
        }

    }

    private int berekenTotaleScore(Student s) {
        int totalscore = 0;
        for (StudentAntwoord sa : s.getAntwoorden()) {
            Vraag vraag = kennistoets.getVraagByVraagnummer(sa.getVraagnummer());
            if (handleAntwoordType(sa, vraag)) {
                totalscore += vraag.getPunt();
            }
        }
        return totalscore;
    }

    private boolean handleAntwoordType(StudentAntwoord sa, Vraag vraag) {
        if (vraag instanceof MeerkeuzeVraag) {
            Antwoord correctAntwoord = vraag.getAntwoord();
            return correctAntwoord.vergelijk(sa.getIngevuldeAntwoord());
        }

        if (vraag instanceof KortAntwoordvraag) {
            List<Antwoord> antwoorden = ((KortAntwoordvraag) vraag).getMogelijkeAntwoorden();
            for (Antwoord correctAntwoord : antwoorden) {
                if (correctAntwoord.vergelijk(sa.getIngevuldeAntwoord())) {
                    return true;
                }
            }
        }
        return false;
    }


    public Lokaal getLokaal() {
        return lokaal;
    }

    public boolean isTijdVerstreken() {
        return tijdVerstreken;
    }

    public Kennistoets getKennistoets() {
        return kennistoets;
    }
}
