package example;

public class Augabe1Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int b = 8;
        b >>>= 9;
        {
            {
                int a = 9;
                a = ++b + a++;
                byte c = 45;
                b = a ^ c;
            }
        }
    }
}
