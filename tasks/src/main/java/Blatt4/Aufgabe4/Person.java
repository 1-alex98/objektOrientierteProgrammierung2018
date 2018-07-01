package Blatt4.Aufgabe4;


public class Person implements Comparable<Person> {

    private String name;
    private String vorname;
    private int plz;
    private String strasse;
    private int hausnr;

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

    public int compareTo(Person o) {
        int vergName = o.name.compareToIgnoreCase(name);
        int vergVorname = o.vorname.compareToIgnoreCase(vorname);
        int vergPlz = o.plz - plz;
        int vergStrasse = o.strasse.compareToIgnoreCase(strasse);
        int vergHausnr = o.hausnr - hausnr;

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
