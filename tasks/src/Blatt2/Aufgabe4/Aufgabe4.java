package Blatt2.Aufgabe4;

public class Aufgabe4 {
    public static void main(String[] args) {
        SchifffahrtsAmt amt = new SchifffahrtsAmt();
        Werft w1 = new Werft();
        w1.produziereSchiff("Gertrut", 12.5, amt);
        Schiff sc1 = new Schiff("Merlin", 45.9);
        amt.register(sc1);
        sc1.setKennzeichen(SchifffahrtsAmt.getKennzeichen());
        amt.meldung("Havarie im Rhein bei Rheinkilometer 591.", 1);
//Ausgabe Empfangen von Gertrut/IHVMXW: Havarie im Rhein bei Rheinkilometer 591.
//Empfangen von Merlin/VPBJQW: Havarie im Rhein bei Rheinkilometer 591.
        amt.meldung("Sonnenschein bei Rheinkilometer 650", 0);
    }

}
