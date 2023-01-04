package eu.asgardschmiede.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class NIORedFile {

    public static void main(String[] args) {

        Path p = Paths.get("data", "content.txt");


        /*try{
            // Alle Zeilen werden in den Speicher eingelesen
            List<String> lines = Files.readAllLines(p);
            lines.removeIf(l ->)
            for (String l : lines) {
                System.out.println(l);
            }

        }catch (IOException e){
            e.printStackTrace();
        }*/
        try{
            // Verwendet die Stream-API
            // Es wird zur Laufzeit nur eine Zeile im Speicher festgehalten
            //Files.lines(p).skip(3).limit(10).forEach(l -> System.out.println(l));
            Files.lines(p) .forEach(l -> System.out.println(l));

        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
