package Blatt3.Aufgabe3;

public class Main {
    public static void main(String[] args) {
        Stereoanlage s = new Stereoanlage();
        Playable pl = new CD();
        s.play(pl);
        pl = new Kassette();
        s.play(pl);
    }

    private static class Stereoanlage {
        public void play(Playable pl) {
            System.out.println("Es spielt: " + pl.play());
        }
    }

    private static class CD implements Playable {
        @Override
        public String play() {
            return "Alle meine was auch immer";
        }
    }

    private static class Kassette implements Playable {
        @Override
        public String play() {
            return "bla bla";
        }
    }
}
