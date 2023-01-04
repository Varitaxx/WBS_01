package eu.asgardschmiede.interfaces;

import java.util.ArrayList;
import java.util.List;

public class InterfaceTest {
    public static void main(String[] args) {

        Person p = new Person("Carol", "Stevenson");
        p.sagHallo();

        Kommunikativ k = new Person("Karl", "Knecht");
        k.sagHallo();

        k = new Hund("Bello");
        k.sagHallo();

        Hund h = new Hund("Hasso");
        //h = new Person();
        h.sagHallo();


        List<Person> liste = new ArrayList<>();
        liste.add(new Person("Steve", "Banner"));
        //liste.add(new Hund()); Hund ist nicht Person

        List<Kommunikativ> liste2 = new ArrayList<>();
        liste2.add(new Person("Bruce", "Banner"));//Person ist Kommunikativ
        liste2.add(new Hund("Watson"));// Hund ist Kommunikativ
        liste2.add(new Roboter());// Roboter ist Kommunikativ


        for (Kommunikativ x : liste2) {
            x.sagHallo();
        }

        System.out.println();

        List<Bewegbar> liste3 = new ArrayList<>();
        liste3.add(new Hund("Bruno"));

        for (Bewegbar x : liste3) {
            x.bewegeAnPos(10,20);
        }

        




    }
}
// Wird ein Interface implementiert, muss eine Klasse alle abstrakteen Methoden anbieten
class Person implements Kommunikativ {
    private String vorname;
    private String nachname;

    public Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    //muss public sein, da die Methode im Interface auch public ist
    public void sagHallo() {
        System.out.println("Hallo");
    }
}

class Hund implements Kommunikativ, Bewegbar{

    private String name;

    public Hund(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //muss public sein, da die Methode im Interface auch public ist
    public void  sagHallo(){
        System.out.println(name + " Wau wau");
    }

    @Override
    public void bewegeAnPos(int x, int y) {
        System.out.println("läuft an Position x " + x + " blabla Position y" + y);
    }
}

class Roboter implements Kommunikativ{
    private static int nr = 0;
    private int seriennummer;

    public Roboter(){
        seriennummer  = nr++;
    }

    public static int getNr() {
        return nr;
    }

    public static void setNr(int nr) {
        Roboter.nr = nr;
    }


    public void sagHallo(){
        System.out.println("Klirr");
    }
}

interface Kommunikativ {
    // Beschreibung, welche Methode notwendig ist, aber nicht wie sie eingebaut wird
    //automatisch public
    void sagHallo(); //abstrakte Methode: kein Body

}

interface Bewegbar {

    void bewegeAnPos(int x, int y);
}
