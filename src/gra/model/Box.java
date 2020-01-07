package gra.model;

import gra.service.Context;

public class Box extends Thing{


    public Box() {
        super("BOX");
    }

    @Override
    public String useThing(Context context) {
        return "OTWIERASZ KUFER";
    }
}
