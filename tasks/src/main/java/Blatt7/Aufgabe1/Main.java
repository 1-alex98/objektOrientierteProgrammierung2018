package Blatt7.Aufgabe1;

public class Main {

    public static void main(String[] args){
        //TierKaefig<? extends Tier> kaefig= new TierKaefig<Katze>();
        //TierKaefig<Hund> kaefig= new TierKaefig<Tier>();
        TierKaefig<?> kaefig= new TierKaefig<Katze>();
        //kaefig.setInsasse(new Katze());
        TierKaefig kaefig1 = new TierKaefig(); // E= Object
        kaefig1.setInsasse(new Hund()); //waring unsure


    }

    public static class TierKaefig<E> {
        private E insasse;
        public void setInsasse(E x){
            insasse= x;
        }
        public E getInsasse(){
            return insasse;
        }
    }
    public static  class Tier {}
    public static  class Hund extends Tier {}
    public static  class Katze extends Tier {}

}
