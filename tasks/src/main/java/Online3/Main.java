package Online3;

public class Main {
    public static void main(String[] args){
        Menge menge = new Menge();
        menge.add(new Paar("Banane",5.5));
        menge.add(new Paar("Apfel",5.5));
        Menge menge2 = new Menge();
        menge2.add(new Paar(45,12));
        menge2.add(new Paar("Banane",5.5));
        Menge join = menge2.join(menge);
        join.print();
    }
}
