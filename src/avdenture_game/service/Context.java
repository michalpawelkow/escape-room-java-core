package avdenture_game.service;

import avdenture_game.model.Box;
import avdenture_game.model.ItemToCreate;
import avdenture_game.model.Matches;
import avdenture_game.model.Thing;
import avdenture_game.repository.Player;
import avdenture_game.repository.Room;

public class Context {

    private Room room;
    private Player player;
    private Game game;
    private Matches matches;


    public Context(Room room, Player player, Game game, Matches matches) {
        this.room = room;
        this.player = player;
        this.game = game;
        this.matches = matches;
    }

    public Context(Room room, Player player, Game game) {
        this.room = room;
        this.player = player;
        this.game = game;
    }

    public void giveThingToActivator(Thing thing){
        player.addThing(thing);
    }
    public void removeThingFromRoom(Thing thing){
        room.removeThing(thing);
    }

    public boolean doesActivatorHaveThing(Thing thing){
        return player.hasThing(thing);
    }
    public void endGame(){
        game.setRunning(false);
    }


    public void lightLocation() {
        room.lightOn();
    }

    //this method will add new model
    public void createItem(ItemToCreate itemToCreate) {
        switch (itemToCreate) {
            case BOX1:
                room.addThing(new Box());
                break;
        }
    }
}
