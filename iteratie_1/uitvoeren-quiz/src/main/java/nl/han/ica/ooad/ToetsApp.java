package nl.han.ica.ooad;

public class ToetsApp {
    public static void main(String[] args) {
        System.out.println("Welkom bij toetsapp");

        ToetsRepository repository = new ToetsRepository();
        Kennistoets kennistoets = repository.getKennistoets(1);
        Student student = new Student("Pietje");
        Lokaal lokaal = new Lokaal(4);
        lokaal.meldStudent(student);

        Uitvoering uitvoering = new Uitvoering(lokaal, kennistoets);
        uitvoering.startToets();
    }
}
