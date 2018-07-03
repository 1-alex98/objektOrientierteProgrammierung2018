package Blatt7.Aufgabe1;

public class Main {
    public static void main(String[] args){
        DoubleList doubleList= new DoubleList();
        doubleList.add(1d);
        doubleList.add(2d);
        doubleList.add(3d);

        doubleList.insertFirst(4d);
        doubleList.insertFirst(5d);

        doubleList.remove(2);
        doubleList.remove(0);
        doubleList.remove(doubleList.size()-1);
        System.out.println(doubleList.get(0));
    }
}
