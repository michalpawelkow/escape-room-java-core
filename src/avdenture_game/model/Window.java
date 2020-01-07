package avdenture_game.model;


import avdenture_game.service.Context;

public class Window extends Thing {
    private boolean open = false;


    public Window() {
        super("WINDOW");
    }

    @Override
    public String useThing(Context context) {
        if (!open) {
            open = true;
            return "WINDOW IS OPENING NOW.";
        }
        open = false;
        return "WINDOW IS CLOSING NOW.";

    }

}
