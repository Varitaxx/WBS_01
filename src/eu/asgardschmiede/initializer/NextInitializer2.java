package eu.asgardschmiede.initializer;

import java.time.LocalTime;

public class NextInitializer2 {

    public static void main(String[] args) {
        BeispielKlasse1 bsp = new BeispielKlasse1();
        System.out.println(bsp.zahl);

    }
}

class BeispielKlasse1 {

    public static final int zahl;

    // einzige Möglichkeit eine finale Klassenvariable dynamisch zu initialisieren
   // Statischer Initializer!
    static {
        if(LocalTime.now().isAfter(LocalTime.NOON)){
            zahl = 20;
        }
        else {
            zahl = 10;
        }
    }

    // zu spät. Statische Eigenschaften sind bereits initialisiert
    BeispielKlasse1(int z){
        //zahl = z;
    }

    public BeispielKlasse1() {
    }
}
