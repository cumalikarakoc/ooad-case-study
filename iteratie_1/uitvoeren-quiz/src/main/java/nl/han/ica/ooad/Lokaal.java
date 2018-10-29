package nl.han.ica.ooad;

import java.util.ArrayList;
import java.util.List;

public class Lokaal {
    private int lokaalnummer;
    private List<Student> studentList = new ArrayList<>();

    public Lokaal(int lokaalnummer) {
        this.lokaalnummer = lokaalnummer;
    }

    public int getLokaalnummer() {
        return lokaalnummer;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void meldStudent(Student student) {
        studentList.add(student);
    }
}
