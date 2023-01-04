package eu.asgardschmiede.imports;

import java.util.Arrays;
import java.util.List;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static java.lang.System.out;

public class ImportTest {

    public static void main(String[] args) {

        out.println(PI);
        out.println(pow(10,2));

        List<Integer> zahlen = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        // import static.java.util.Arrays.asList
        //List<Integer> zahlen = asList(1,2,3,4,5,6,7,8,9,0);

    }
    class Other { //Innere Klasse

    }
}
