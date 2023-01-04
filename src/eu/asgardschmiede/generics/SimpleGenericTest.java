package eu.asgardschmiede.generics;

public class SimpleGenericTest {
    public static void main(String[] args) {

        GenericBox <String>box = new GenericBox<>();
        box.set("Das ist ein Wert");
        System.out.println(box.get());

        GenericBox <Integer>box2 = new GenericBox<>();
        box2.set(123);
        System.out.println(box2.get());

    }
}

class GenericBox<T>{ //<T> hier wird
    private T wert;

    public T get() {
        return wert;
    }

    public void set(T wert) {
        this.wert = wert;
    }
}
