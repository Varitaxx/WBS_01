package eu.asgardschmiede.initializer;

public class NextInitializer {
    //Wird ausgeführt sobald die Klasse geladen wird
    //Wird nur 1 x ausgeführt
    static {//statischer Initializer
        System.out.println("static init");

        //ExceptionInInitializerError: es gibt keine Möglichkeit der Behandlung
       // int[] arr = {1,2,3,4};
        //System.out.println(arr[10]);
         }

    { //Intanz Initializer, wird bei jeder Instanz der Klasse aufgerufen
        System.out.println("init");

        //ArrayIndexOutOfBounceException: kann bei der Instanzierung behandelt werden
        int[] arr = {1,2,3,4};
        System.out.println(arr[10]);
    }

    public static void main(String[] args) {
        //Instanz der Klasse
        NextInitializer obj = null;
        try {
            obj = new NextInitializer();
            obj = new NextInitializer();
        }
        catch(Exception e){
            System.out.println("Problem bei der Instanzierung des Objekts");
        }

        // Eine Instanz der Klasse als Objekt
        System.out.println(obj);

        //Ein Objekt welches die Definition der Klasse beschreibt
        System.out.println(obj.getClass());
    }
}
