package eu.asgardschmiede.nio;

import java.io.IOException;
import java.nio.file.*;
import static java.nio.file.StandardWatchEventKinds.*;

public class DirEventsWatcherTest {
    public static void main(String[] args) {

        Path p = Paths.get("data");

        try {
            WatchService watcher = FileSystems.getDefault().newWatchService();

            p.register(watcher, ENTRY_CREATE, ENTRY_MODIFY, ENTRY_DELETE);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
