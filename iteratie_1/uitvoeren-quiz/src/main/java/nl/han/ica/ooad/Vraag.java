package nl.han.ica.ooad;

public abstract class Vraag {
    private int vraagnummer;
    private String vraag;
    private int punt;
    private Antwoord antwoord;

    protected Vraag(int vraagnummer, String vraag, int punt, Antwoord antwoord) {
        this.vraagnummer = vraagnummer;
        this.vraag = vraag;
        this.punt = punt;
        this.antwoord = antwoord;
    }

    protected Vraag(int vraagnummer, String vraag, int punt) {
        this.vraagnummer = vraagnummer;
        this.vraag = vraag;
        this.punt = punt;
    }

    public int getVraagnummer() {
        return vraagnummer;
    }

    public String getVraag() {
        return vraag;
    }

    public int getPunt() {
        return punt;
    }

    public Antwoord getAntwoord() {
        return antwoord;
    }
}
