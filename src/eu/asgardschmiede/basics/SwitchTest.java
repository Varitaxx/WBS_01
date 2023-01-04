package eu.asgardschmiede.basics;

public class SwitchTest {
    public static void main(String[] args) {

        /*Integer eingabe = 1;

        switch(eingabe){
            case 5: System.out.println("A"); break;
            case 10: System.out.println("B"); break;
            case 15: System.out.println("C"); break;
            case 25: System.out.println("C"); break;
            default: System.out.println("Huch");
        }*/
        int eingabe = 100;
        final int c1 = 10;
        final int c2 = 15;
        final int c3 = 20;

        switch(eingabe){
            case c1: System.out.println("A");break;
            case c2: System.out.println("B");break;
            case c3: System.out.println("C");break;

        }
    }
}
