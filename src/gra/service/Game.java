package gra.service;

import gra.repository.Player;
import gra.repository.Room;
import gra.model.Thing;

import java.util.List;

//backend
public class Game {
    private Room room;
    private Player player1;
    private boolean running = true;

    public Game(Room room, Player player1) {
        this.room = room;
        this.player1 = player1;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }


    List<Thing> getThingsInPlayer(){
        return player1.getThings();
    }


    public String useThing(int index){
        String effect = actionOnThing(index);
        updateOtherThings();
        return effect;
    }

    public String actionOnThing(int index) {
        Thing foundThing =  room.getNotHiddenThing(index);
        return foundThing.useThing(new Context(room,player1,this));
    }

    public void updateOtherThings() {
        updateHiddenItems();
    }

    public void updateHiddenItems() {
        if (room.isLight()) {
            for (Thing thing : room.getThings()) {
                thing.reactToLight();
            }
        }
    }

    public boolean isRunning() {
        return running;
    }

    public List<Thing> getThingsToPrint() {
        return room.getNotHiddenThingsInRoom();
    }
}
