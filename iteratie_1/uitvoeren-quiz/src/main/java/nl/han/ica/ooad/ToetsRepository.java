package nl.han.ica.ooad;

import java.util.ArrayList;
import java.util.List;

public class ToetsRepository {
    private List<Kennistoets> kennistoetsList = new ArrayList<>();

    public ToetsRepository() {
        //voorbeeld kennistoets
        Kennistoets kennistoets = new Kennistoets(1, "requirements", 50);
        kennistoets.setVragenLijst(initVragen(5));
        kennistoetsList.add(kennistoets);
    }

    private List<Vraag> initVragen(int antaal) {
        List<Vraag> vragen = new ArrayList<>();

        // vraag 1
        String vraagText_1 = "Welke van de begrippen needs, features en requirements horen bij het solution domain?";
        String[] opties_1 = {"A: needs, features en requirements", " B: needs en requirements", " C: features en requirements", " D: alleen requirements"};
        Antwoord antwoord_1 = new MeerkeuzeAntwoord("A");
        Vraag vraag_1 = new MeerkeuzeVraag(1, vraagText_1, 3, antwoord_1, opties_1);
        vragen.add(vraag_1);

        // vraag 2
        String vraagText_2 = "Welke term wordt gebruikt voor ‘the ability to describe and follow the life of a requirement, in both forwards and backwards direction’?";
        List<Antwoord> mogelijkeAntwoorden = new ArrayList<>();
        mogelijkeAntwoorden.add(new KortAntwoordAntwoord("traceability"));
        mogelijkeAntwoorden.add(new KortAntwoordAntwoord("tracebility"));
        mogelijkeAntwoorden.add(new KortAntwoordAntwoord("traceabillity"));
        mogelijkeAntwoorden.add(new KortAntwoordAntwoord("tracebillity"));
        Vraag vraag_2 = new KortAntwoordvraag(2, vraagText_2, 5, mogelijkeAntwoorden);
        vragen.add(vraag_2);

        // vraag 3
        String vraagText_3 = "Wat wordt bedoeld met ‘elicit needs from stakeholders’ ?";
        String[] opties_3 = {"A: Het boven tafel krijgen van de needs van belanghebbenden.", " B: Het documenteren van de needs van belanghebbenden.",
                " C: Het valideren van de needs van belanghebbenden.", " D: Het vertalen van de needs van belanghebbenden naar software features."};
        Antwoord antwoord_3 = new MeerkeuzeAntwoord("C");
        Vraag vraag_3 = new MeerkeuzeVraag(3, vraagText_3, 2, antwoord_3, opties_3);
        vragen.add(vraag_3);

        return vragen;
    }

    public Kennistoets getKennistoets(int id) {
        for (Kennistoets k : kennistoetsList) {
            if (k.getId() == id) {
                return k;
            }
        }
        return null;
    }
}