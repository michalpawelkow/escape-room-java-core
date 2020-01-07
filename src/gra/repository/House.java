package gra.repository;

import gra.repository.Room;

import java.util.ArrayList;
import java.util.List;

public class House {

    private List<Room> rooms = new ArrayList<>();

    public House(){

    }

    public void addRoom(Room room){
        rooms.add(room);
    }


}
