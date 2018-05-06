package Blatt2.Aufgabe4;

import java.util.Arrays;

public class SchifffahrtsAmt {
    private Schiff[] schiffs = new Schiff[50];

    public static String getKennzeichen() {
        java.util.Random rnd = new java.util.Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) ((rnd.nextInt(25) + 65)));
        }
        return sb.toString();
    }

    public void register(Schiff schiff) {
        for (int i = 0; i < schiffs.length; i++) {
            if (schiffs[i] == null) {
                schiffs[i] = schiff;
                break;
            }
        }
    }

    public void meldung(String msg, int dringlichkeit) {
        if (dringlichkeit == 1) {
            Arrays.stream(schiffs).forEach(schiff -> {
                if (schiff != null) {
                    schiff.sendMessage(msg);
                }
            });
        }
    }
}
