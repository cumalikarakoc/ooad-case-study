package nl.han.ica.ooad;

import java.util.ArrayList;
import java.util.List;

public class Kennistoets {
    private int id;
    private String name;
    private int tijdInMinuten;
    private List<Vraag> vragen = new ArrayList<>();

    public Kennistoets(int id, String name, int tijdInMinuten) {
        this.id = id;
        this.name = name;
        this.tijdInMinuten = tijdInMinuten;
    }

    public int getId() {
        return id;
    }

    public List<Vraag> getVragen() {
        return vragen;
    }

    public Vraag getVraagByVraagnummer(int vraagnummer){
        for(Vraag v: vragen){
            if(v.getVraagnummer() == vraagnummer){ return v;}
        }
        return null;
    }

    public int getTijdInMinuten() {
        return tijdInMinuten;
    }

    public void setVragenLijst(List<Vraag> vragen) {
       this.vragen = vragen;
    }
}
