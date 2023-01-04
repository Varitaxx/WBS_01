package eu.asgardschmiede.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ListTest {

    public static void main(String[] args) {

        List<Integer> zahlen = new ArrayList<>(Arrays.asList(2,10,25,17,1,99,172,230));

        //boolean test(T t)
        //Predicate<Integer> p1 = (z) -> z <= 20;
        //zahlen.removeIf(p1);
        zahlen.removeIf((papperlapapp)-> papperlapapp <= 170);

        System.out.println(zahlen);

        zahlen.forEach(i -> System.out.println(i));

    }

}

