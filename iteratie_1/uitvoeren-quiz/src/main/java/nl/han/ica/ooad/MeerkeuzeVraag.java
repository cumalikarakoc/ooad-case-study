package nl.han.ica.ooad;

public class MeerkeuzeVraag extends Vraag {
    private String [] opties;
    private Antwoord antwoord;

    protected MeerkeuzeVraag(int vraagnummer, String vraag, int punt, Antwoord antwoord, String[] opties) {
        super(vraagnummer, vraag, punt, antwoord);
        this.opties = opties;
    }

    public String[] getOpties() {
        return opties;
    }
}
