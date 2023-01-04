package eu.asgardschmiede.lambdas;

import java.util.ArrayList;
import java.util.LinkedList;

public class DynamicTypeTest1 {
    public static void main(String[] args) {
        // Kurzschreibweise ab Java 9
        var i = 100; // Im Kompilat steht ein fester Typ
        //i = 10.0; // Geht nicht, da i auf int festgelegt ist.

        var list = new ArrayList<String>();
        //list = new LinkedList<>(); // geht nicht, da list zuvor als ArrayList definiert wurde

        Integer j = 100; //Landet im Byte-Literal-Pool
        j = new Integer(100); // Landet nicht im Byte-Literal-Pool
        j = Integer.valueOf(100); // Landet nicht im Byte-Literal-Pool
    }
}
