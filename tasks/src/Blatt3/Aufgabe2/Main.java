package Blatt3.Aufgabe2;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("name", new Fur(2));
        Sheep clone = sheep.clone();
        sheep.shear();
        System.out.println(clone.fur.length == 0 ? "Clone geschoren" : "Clone nicht geschoren");
    }
}
