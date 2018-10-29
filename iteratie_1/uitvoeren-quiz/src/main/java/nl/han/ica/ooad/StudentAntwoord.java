package nl.han.ica.ooad;

public class StudentAntwoord {
    private int vraagnummer;
    private String ingevuldeAntwoord;

    public StudentAntwoord(int vraagnummer, String ingevuldeAntwoord) {
        this.vraagnummer = vraagnummer;
        this.ingevuldeAntwoord = ingevuldeAntwoord;
    }

    public String getIngevuldeAntwoord() {
        return ingevuldeAntwoord;
    }

    public int getVraagnummer() {
        return vraagnummer;
    }
}
