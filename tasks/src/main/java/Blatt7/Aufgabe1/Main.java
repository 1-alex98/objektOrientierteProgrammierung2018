package Blatt7.Aufgabe1;

public class Main {

    public static void main(String[] args){
        //TierKaefig<Tier> kaefig= new TierKaefig<Katze>(); not compiling
        //TierKaefig<Hund> kaefig= new TierKaefig<Tier>(); not compiling
        //TierKaefig<?> kaefig= new TierKaefig<Katze>();
        //kaefig.setInsasse(new Katze()); not compiling
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
