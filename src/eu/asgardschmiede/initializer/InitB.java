package eu.asgardschmiede.initializer;

public class InitB extends InitA{

    static {
        System.out.println("InitB: static Init");
    }

    {
        System.out.println("InitB: init");
    }

    public InitB() {
        System.out.println("Instanz von B");
    }
}
