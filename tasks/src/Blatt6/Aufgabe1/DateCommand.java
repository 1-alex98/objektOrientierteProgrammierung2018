package Blatt6.Aufgabe1;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class DateCommand implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(OffsetDateTime.now().format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));
        }
    }
}
