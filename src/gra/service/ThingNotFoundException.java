package gra.service;

public class ThingNotFoundException extends RuntimeException {

    public ThingNotFoundException(){
        super("ITEM NOT FOUND.");
    }

}
