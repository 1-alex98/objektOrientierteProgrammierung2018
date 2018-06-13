package Blatt6.Aufgabe2;

import java.io.File;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class FileWatcher implements Runnable {
    private final File file;
    private final ScheduledExecutorService scheduledExecutorService;
    private long lastModified;

    public FileWatcher(File file, ScheduledExecutorService scheduledExecutorService) {
        this.file = file;
        this.scheduledExecutorService = scheduledExecutorService;
        lastModified = file.lastModified();
        scheduledExecutorService.scheduleAtFixedRate(this, 0, 3, TimeUnit.SECONDS);
    }

    @Override
    public void run() {
        if (file.lastModified() != lastModified) {
            lastModified = file.lastModified();
            if (!file.exists()) {
                System.out.println("File was deleted or moved...");
                return;
            }
            System.out.println(String.format("File '%s' was modified at '%s'", file.getPath(), LocalDateTime.ofInstant(Instant.ofEpochMilli(lastModified), ZoneId.systemDefault()).format(DateTimeFormatter.ISO_DATE_TIME)));
        }
    }
}
