package Blatt7.Aufgabe3;

public class Main {
    public static void main(String[] args){
        Stack<String> stringStack= new Stack<>();
        stringStack.push("Apfel")
                .push("Oragne")
                .push("Erdbeere")
                .push("Kiwi");
        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());
    }
}
