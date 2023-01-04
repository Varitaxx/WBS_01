package eu.asgardschmiede.initializer;

public class InitA {

    static {
        System.out.println("InitA: static Init");
    }

    {
        System.out.println("InitA: init");
    }

    public InitA() {
        System.out.println("Instanz von A");
    }
}
