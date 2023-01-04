package eu.asgardschmiede.initializer;

public class InitializerABTest {

    public static void main(String[] args) {
        InitA a = new InitA();
        System.out.println();
        a = new InitA();
        System.out.println("*****************************************************");

        InitB b = new InitB();
        System.out.println();
        b = new InitB();

    }
}
