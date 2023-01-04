package eu.asgardschmiede.einkaufsliste;

public class App {
    public static void main(String[] args) {

        // Klasse ist ein Bauplan für ein Objekt. D.h. es beschreibt, wie ein Objekt aufgebaut ist,
        // das Objekt muss erst gebaut werden, damit es benutzt werden kann.

        // mit "new" baut man aus einer Klasse ein Objekt



        System.out.println("Shoppinglist");

        // Bevor ich Daten in einem Objekt ablegen kann muss es instanziert werden
        Item i1 = new Item();

        // Informationen in ein Objekt schreiben
        i1.setName("Milch 1,5% Fett"); // Der Alte Wert wird überschrieben
        i1.setCategory("Milchprodukte");
        i1.setAmount(10);

        Item i2 = new Item();
        i2.setName("Honig");
        i2.setCategory("Naturprodukte");
        i2.setAmount(1);
        i2.setName(null);

        // Eigenschaft des Obejtes i1
        //i1.amount

        // Eigenschaften sind Variablen, die zu einem Objekt gehören

        // Keine Eigenschaft, da diese Variable NICHT zu einem Objekt gehört
        int amount = 100; // Test

        // Informationen aus einem Objekt lesen
        //System.out.println(i1.name + ", " + i1.category + ", Anzahl: " + i1.amount);
        //System.out.println(i2.name + ", " + i2.category + ", Anzahl: " + i2.amount);

        System.out.println(i1.showDetails()); // Methoden haben Klammern für Parameter
        System.out.println(i2.showDetails()); // Methoden haben Klammern für Parameter
        System.out.println(i2.preisSteigerung()); // Methoden haben Klammern für Parameter
        // Eigenschaften haben KEINE Klammern

        //System.out.println(i1);

    }
}
