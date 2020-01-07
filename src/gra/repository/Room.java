package gra.repository;

public class Room extends ThingsContainer{

    private boolean light;

    public Room() {
    }

    public void lightOn() {
        light = true;
    }

    public boolean isLight() {
        return light;
    }


}
