package avdenture_game.model;

import avdenture_game.service.Context;

public class Candle extends Thing {
    //needed item
    private Matches matches;

    public Candle(Matches matches) {
        super("CANDLE");
        this.matches = matches;
    }


    @Override
    public String useThing(Context context) {
        if (!context.doesActivatorHaveThing(matches)) {
            return "PLAYER MUST TAKE MATCHES TO USE CANDLE ";
        }
        // this work if player can't lose a candle, if he can - need to additional check
        context.lightLocation();
        return "PLAYER HAVE A CANDLE IN HIS POCKET, SO HE LIGHTS CANDLE";

    }
}
