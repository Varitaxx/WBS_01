package eu.asgardschmiede.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class NIOFilesTest {
    public static void main(String[] args) {

        Path p = Paths.get("data/content-next.txt");

        try{
            if(!Files.exists(p))
                Files.createFile(p);

            Path d = p.getParent().resolve("sub/subsub");
            if(!Files.exists(d)){
               // Files.createDirectory(d); //Erzeugt ein Verzeichnis
                Files.createDirectories(d); // Erzeugt mehrere Verzeichnisse
            }

            Path ap = p.toAbsolutePath();

            System.out.println(p);
            System.out.println(ap);

            System.out.println(Files.isSameFile(p,ap)); // Führt ein Path-Vergleich durch

            Path np = d.resolve("content-next.txt");

            //File kopieren
            //Files.copy(p, d.resolve("content-next.txt"));// Exception wenn Datei bereits existiert
            Files.copy(p,np, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES);
            d= d.getParent().resolve(p.getFileName());

            // verschieben
            Files.move(np, d, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);


        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
