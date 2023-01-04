package eu.asgardschmiede.generics;

public class SimpleClass <T,S,R>{

    private T name;


    private T change(){
        return name;
    }

    public T change(S input){
        return (T) input;
    }


}
