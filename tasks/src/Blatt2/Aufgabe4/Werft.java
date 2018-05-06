package Blatt2.Aufgabe4;

public class Werft {

    public Schiff produziereSchiff(String name, double length, SchifffahrtsAmt schifffahrtsAmt) {
        Schiff schiff = new Schiff(name, length);
        schifffahrtsAmt.register(schiff);
        schiff.setKennzeichen(SchifffahrtsAmt.getKennzeichen());
        return schiff;
    }
}
