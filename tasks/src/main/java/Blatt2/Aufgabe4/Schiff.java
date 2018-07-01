package Blatt2.Aufgabe4;

import java.text.MessageFormat;

public class Schiff {
    private final String name;
    private final double länge;
    private String kennzeichen;

    public Schiff(String name, double länge) {
        this.name = name;
        this.länge = länge;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public void sendMessage(String msg) {
        System.out.println(MessageFormat.format("Schiff mit Namen: {0} und Kennzeichen: {1} hat Nachricht: {2} bekommen.", name, kennzeichen, msg));
    }

}
