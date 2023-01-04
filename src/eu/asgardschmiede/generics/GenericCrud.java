package eu.asgardschmiede.generics;

public interface GenericCrud <T> {

    void insert(T p);
    void update(T p);
    void delete(T p);
    void read(T p);
}
