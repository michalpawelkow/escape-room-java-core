package avdenture_game.model;

import avdenture_game.service.Context;

public class Box extends Thing{


    public Box() {
        super("BOX");
    }

    @Override
    public String useThing(Context context) {
        return "YOU ARE OPEN THE BOX";
    }
}
