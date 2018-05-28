package Blatt4.Aufgabe4;

public class Person implements Comparable {

    private String name;
    private String vorname;
    private int plz;
    private String strasse;
    private int hausnr;
    private Person person;

    public Person(String n, String v, int p, String s, int h) {
        name = n;
        vorname = v;
        plz = p;
        strasse = s;
        hausnr = h;
    }

    public int getHausnr() {
        return hausnr;
    }

    public int compareTo(Object o) {
        person = (Person) o;
        int vergName = person.name.compareToIgnoreCase(name);
        int vergVorname = person.vorname.compareToIgnoreCase(vorname);
        int vergPlz = person.plz - plz;
        int vergStrasse = person.strasse.compareToIgnoreCase(strasse);
        int vergHausnr = person.hausnr - hausnr;

        if (vergName == 0) {
            if (vergVorname == 0) {
                if (vergPlz == 0) {
                    if (vergStrasse == 0) {
                        if (vergHausnr == 0) {
                            return 0;
                        } else return vergHausnr;
                    } else return vergStrasse;
                } else return vergPlz;
            } else return vergVorname;
        } else return vergName;
    }
}
