package eu.asgardschmiede.basics;

public class ContinueTest {

    public static void main(String[] args) {

        /*for (int i = 0; i < 100; i++) {

            if(i %5 != 0){
                continue;
            }
            System.out.println("Tach: " + i);
            
        }*/

        /*for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if(i == 4){
                    break;
                }
                System.out.print(i + " : " + j + ";  ");
            }
            System.out.println();


        }*/

        int[] zahlen = {2,5,9,10,22,13,7};

        for (int z : zahlen) {

            if(z % 2 == 0){
                break;
            }
            System.out.println(z);

        }
    }
}
