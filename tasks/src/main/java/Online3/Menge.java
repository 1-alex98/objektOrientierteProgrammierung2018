package Online3;

import lombok.Getter;

import java.awt.*;
import java.util.Hashtable;
import java.util.function.BiConsumer;

public class Menge {
    @Getter
    private Hashtable<Integer,Paar> integerPaarHashtable= new Hashtable<>();

    public void add(Paar paar){
        integerPaarHashtable.put(paar.hashCode(),paar);
    }

    public boolean contains(Paar paar){
        return integerPaarHashtable.contains(paar.hashCode());
    }

    public void print(){
        System.out.println("Printing list");
        integerPaarHashtable.forEach((integer, paar) -> System.out.println(paar));
    }

    public Menge join(Menge menge){
        Menge newMenge = new Menge();
        BiConsumer<Integer, Paar> integerPaarBiConsumer = (integer, paar) -> newMenge.add(paar);
        integerPaarHashtable.forEach(integerPaarBiConsumer);
        menge.getIntegerPaarHashtable().forEach(integerPaarBiConsumer);
        return newMenge;
    }
}
