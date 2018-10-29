package nl.han.ica.ooad;

public abstract class Antwoord {
    private String goedAntwoord;

    protected Antwoord(String goedAntwoord) {
        this.goedAntwoord = goedAntwoord;
    }

    public String getGoedAntwoord() {
        return goedAntwoord;
    }

    public boolean vergelijk(String ingevuldeAntwoord){
        return ingevuldeAntwoord.equalsIgnoreCase(goedAntwoord);
    }
}
