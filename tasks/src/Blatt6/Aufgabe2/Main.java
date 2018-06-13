package Blatt6.Aufgabe2;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class Main {
    private static final ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);

    public static void main(String[] args) throws IOException, InterruptedException {
        Path temp = Files.createTempFile("temp", ".data");
        new FileWatcher(temp.toFile(), scheduledExecutorService);
        try (FileWriter fileWriter = new FileWriter(temp.toFile(), true)) {
            fileWriter.write("Hallo ich verändere das File");
        }
        Thread.sleep(15000);
        scheduledExecutorService.shutdown();
    }
}
