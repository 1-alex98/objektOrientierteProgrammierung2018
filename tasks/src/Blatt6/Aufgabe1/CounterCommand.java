package Blatt6.Aufgabe1;

import java.util.Random;

public class CounterCommand implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
