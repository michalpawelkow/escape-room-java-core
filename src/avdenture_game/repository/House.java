package avdenture_game.repository;

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
