package eu.asgardschmiede.io.json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class JsonLesen {
    public static void main(String[] args) {

        Gson gson = new Gson();

        try(Reader in = Files.newBufferedReader(Paths.get("data.json"))){

            /*Map<?, ?> map = gson.fromJson(in,Map.class);
            for (Map.Entry<?,?> e : map.entrySet()){
                System.out.println(e.getKey() + " = " + e.getValue());
            }*/

            //Held held = gson.fromJson(in,Held.class);
            //System.out.println(held);

            List<Held> helden = gson.fromJson(in, new TypeToken<List<Held>>(){}.getType());
            helden.forEach(System.out::println);

        }
        catch (IOException e){
            e.printStackTrace();
        }

    }

}
