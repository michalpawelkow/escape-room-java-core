package gra.model;

import gra.service.Context;

public class Matches extends Thing {

    public Matches() {
        super("MATCHES");
    }
    @Override
    public String useThing(Context context) {
        context.giveThingToActivator(this);
        context.removeThingFromRoom(this);
        return  "PLAYER USES A MATCH TO LIGHT UP CANDLE ";
    }

}
