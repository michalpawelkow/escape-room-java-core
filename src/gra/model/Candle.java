package gra.model;

import gra.service.Context;

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
        //todo działa o ile gracz nie może stracić świeczki - jeśli może - zrobić dodatkowe sprawdzenie
        context.lightLocation();
        return "PLAYER HAVE A CANDLE IN HIS POCKET, SO HE LIGHTS CANDLE";

    }
}
