package eu.asgardschmiede.io.json;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ObjectToJson {

    public static void main(String[] args) {

        Gson gson = new Gson();

        Held held = new Held("Peter", "Parker", new String[]{"Trier", "Kiel"}, 33, false);
        System.out.println(gson.toJson(held));

        System.out.println();

        List<Held> helden = new ArrayList<>();
        helden.add(new Held("Peter", "Parker", new String[]{"Trier", "Kiel"}, 33, false));
        helden.add(new Held("Hans", "Banner", new String[]{"Trier"}, 52, true));
        helden.add(new Held("Miguel", "Stroke", new String[]{"Koblenz"}, 41, false));

        // Als JSON ausgeben
        System.out.println(gson.toJson(helden));

        //JSON in eine Datei schreiben
        try(Writer out = Files.newBufferedWriter(Paths.get("data2.json"), Charset.forName("UTF-8"))){
            gson.toJson(helden,out);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
