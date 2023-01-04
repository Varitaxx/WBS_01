package eu.asgardschmiede.klausur;


public class Aufgabe {
    public static void main(String[] args) {
        Double d = 10.0;
        int i = 10;
        Integer wi = 10;
        System.out.print(wi.equals(d));
        System.out.print(d.equals(wi));
        System.out.print(d.equals(i));
        System.out.print(d == i);
        //System.out.print((wi == d));

    }
}

