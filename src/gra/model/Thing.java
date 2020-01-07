package gra.model;


import gra.service.Context;

public abstract class Thing {

    private String thingName;
    boolean hidden;


    public Thing(String thingName) {
        this.thingName = thingName;
    }

   public abstract String useThing(Context context);

    @Override
    public String toString() {
        return thingName;
    }

    public boolean isHidden() {
        return hidden;
    }

    public  void reactToLight(){

    }
}
