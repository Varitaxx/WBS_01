package eu.asgardschmiede.testklausur;
class Aufgabe {
    static int i;
    public static void main(String [] args) {
        // Byteliteralpool nur bis -128 bis  127!!!
        Integer i1 = 100;
        Integer i2 = 128;
        Integer i3 = 128;
        Integer i4 = 100;

        System.out.println(i2 == i3);
        System.out.println(i1 == i4);


    }
}
