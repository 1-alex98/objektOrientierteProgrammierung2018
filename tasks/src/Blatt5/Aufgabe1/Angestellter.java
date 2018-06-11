package Blatt5.Aufgabe1;

public class Angestellter {
    private String vorname;
    private String nachname;
    private int alter;
    private int gehalt;

    public Angestellter(String vorname, String nachname, int alter, int gehalt) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
        this.gehalt = gehalt;
    }

    public void altern() {
        alter++;
    }

    public void mehrGeld(int betrag) {
        gehalt += betrag;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public int getAlter() {
        return alter;
    }

    public int getGehalt() {
        return gehalt;
    }
}
