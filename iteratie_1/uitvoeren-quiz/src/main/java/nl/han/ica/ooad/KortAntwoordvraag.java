package nl.han.ica.ooad;

import java.util.List;

public class KortAntwoordvraag extends Vraag {
    private List<Antwoord> mogelijkeAntwoorden;

    protected KortAntwoordvraag(int vraagnummer, String vraag, int punt, List<Antwoord> mogelijkeAntwoorden) {
        super(vraagnummer, vraag, punt);
        this.mogelijkeAntwoorden = mogelijkeAntwoorden;
    }

    public List<Antwoord> getMogelijkeAntwoorden() {
        return mogelijkeAntwoorden;
    }
}
