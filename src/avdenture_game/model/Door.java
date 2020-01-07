package avdenture_game.model;

import avdenture_game.service.Context;

public class Door extends Thing {
    private Key matchingKey;
    private boolean close = true;

    public Door(Key matchingKey) {
        super("DOOR");
        this.matchingKey = matchingKey;
    }


    @Override
    public String useThing(Context context) {
        if (context.doesActivatorHaveThing(matchingKey)) {
            close = false;
            context.endGame();
            return "DOOR IS OPEN! CONGRATULATIONS!!!" + "\n" + " YOU WIN THE GAME!!!";
        }  else {
            return "YOU NEED A KEY TO OPEN THIS DOOR.";
        }
    }


}
