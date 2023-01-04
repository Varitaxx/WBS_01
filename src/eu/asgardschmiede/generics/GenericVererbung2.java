package eu.asgardschmiede.generics;

public class GenericVererbung2 {
    public static void main(String[] args) {

        Parent p1 = new Parent();
        p1.change("ABC"); // change verlangt ein Objekt, Widening von String zu Object
        p1.change(1); //Autoboxing von int zu Integer und Widening von Integer zu Object

        Parent<String> p2 = new Parent<>();
        p2.change("ABC"); // Verlangt einen String
       // p2.change(1); //Error

        //Generische Typen müssen IMMER Objekttypen sein!!

        Child<String, Integer> c1 = new Child<>();
        c1.nextChange(123);
        c1.change("ABCD");

        //Kompiler erweitert Code bei Verwendung von Generics um Casts
        c1.change((String) "ABCD"); // Das passiert im Kompilat

    }
}

//Wird bei einer generischen Klasse kein generischer Typ vorgegeben wird ein Object verwendet
class Parent<T>/* Hier wird ein Platzhalter für einen generischen Typ benannt*/{
    public T change (T t){
        return t;
    }
}

class Child<T,S> extends Parent<T> /* hier wird ein generischer oder konkreter Typ eingesetzt*/{
    public S nextChange(S s){
        return s;
    }
}
