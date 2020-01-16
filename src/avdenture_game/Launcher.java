package avdenture_game;

import avdenture_game.model.*;
import avdenture_game.repository.House;
import avdenture_game.repository.Player;
import avdenture_game.repository.Room;
import avdenture_game.service.Controller;
import avdenture_game.service.Game;

public class Launcher {

    public static void main(String[] args) {
        //application submission
        Room livingRoom = new Room();
        Key key = new Key();
        livingRoom.addThing(key);
        Matches matches = new Matches();
        livingRoom.addThing(matches);
        livingRoom.addThing(new Window());
        livingRoom.addThing(new Door(key));
        livingRoom.addThing(new Candle(matches));

        House house1 = new House();
        Player player = new Player("MICHAEL");
        house1.addRoom(livingRoom);

        Game game = new Game(livingRoom,player);
        Controller controller = new Controller(game);

        //this will start game
        controller.startGame();

        //
        System.out.println("ZMIANA KODU !!");


    }

}
