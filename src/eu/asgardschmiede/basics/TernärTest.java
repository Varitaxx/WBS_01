package eu.asgardschmiede.basics;

public class TernärTest {
    public static void main(String[] args) {

        int z = 6;
        System.out.println(z <= 10 ? "kleiner oder gleich" : "größer");

        if(z <= 10){

            if(z == 10){
                System.out.println("gleich 10");
            }
            else {
                System.out.println("kleiner 10");
            }
        }
        else{
            System.out.println("größer 10");
        }

        String out = (z <=10) ? (z <5) ? "kleiner 5, kleiner gleich 10" : "kleiner gleich 10" : "größer 10";
        System.out.println(out);

        int x = -1;
        System.out.println(x==0?"0":x>0?">":"<");

    }
}
