package gra.repository;

import gra.service.ThingNotFoundException;
import gra.model.Thing;

import java.util.ArrayList;
import java.util.List;

public class ThingsContainer {

    protected List<Thing> things = new ArrayList<>();


    public List<Thing> getThings() {
        return things;
    }

    public void removeThing(Thing thing) {
        things.remove(thing);
    }

    public void addThing(Thing thing) {
        things.add(thing);
    }

    public Thing getThing(int index) {
        if (index < things.size() && index >= 0) {
            return things.get(index);
        }
        throw new ThingNotFoundException();
    }

    public List<Thing> getNotHiddenThingsInRoom(){
        List<Thing> all = getThings();
        List<Thing> notHidden = new ArrayList<>();
        for (Thing thing : all) {
            if (!thing.isHidden()) {
                notHidden.add(thing);
            }
        }
        return notHidden;
    }

    public Thing getNotHiddenThing(int index) {
        List<Thing> things = getNotHiddenThingsInRoom();
        if (index < things.size() && index >= 0) {
            return things.get(index);
        }
        throw new ThingNotFoundException();
    }

    public boolean hasThing(Thing thing) {
        return things.contains(thing);
    }
}
