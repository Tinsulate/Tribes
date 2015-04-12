package jussis.tribes.core.physical;

import jussis.tribes.core.actor.Actor;

import java.util.Collection;
import java.util.Collections;

/**
 * A location with a meaning, for example:
 * - A Camp
 * - A hunting ground
 * - A marketplace
 * - Ritual ground
 */
public class Place {

    public String name;
    public String description;

    public void getActorsPresent() {
        //TODO:
    }

    public Collection<Actor> getHumansPresent() {
        return Collections.EMPTY_LIST; //TBD
    }
}
