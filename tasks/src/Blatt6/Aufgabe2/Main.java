package Blatt6.Aufgabe2;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class Main {
    private static final ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

    public static void main(String[] args) throws IOException, InterruptedException {
        Path temp = Files.createTempFile("temp", ".tmp");
        temp.toFile().deleteOnExit();
        new FileWatcher(temp.toFile(), scheduledExecutorService);
        try (FileWriter fileWriter = new FileWriter(temp.toFile(), true)) {
            fileWriter.write("Hallo ich verändere das File");
        }
        Thread.sleep(15000);
        //Default Executor service used which uses non-daemon threads so we need to shit it down, otherwise programm won't terminate :(((( and I am to lazy to make my own thread factory XD
        scheduledExecutorService.shutdown();
    }
}
