package avdenture_game.model;

import avdenture_game.service.Context;

public class Key extends Thing {
    public Key() {
        super("KEY");
        hidden = true;
    }

    @Override
    public String useThing(Context context) {
        if (!hidden) {
            context.giveThingToActivator(this);
            context.removeThingFromRoom(this);
            return "PLAYER TOOK KEY.";
        } else return "PLAYER CAN'T FIND A KEY. IT'S TOO DARK.";
    }

    @Override
    public void reactToLight() {
        hidden = false;
    }
}