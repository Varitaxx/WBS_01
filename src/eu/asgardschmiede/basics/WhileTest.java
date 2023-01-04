package eu.asgardschmiede.basics;

public class WhileTest {

    public static void main(String[] args) {

        //Kopfgesteuert
        int i = 0;
        while(true){
            if(i > 10)
                break;
            System.out.println(++i);// 1.... 11
        }

        // Fußgesteuert
        i = 0;
        do {
            System.out.println("Tach auch");

            if (++i == 5)
                break;
        }
        while(true);
        i = 0;
        System.out.println(i++);
        System.out.println(i);
    }
}
