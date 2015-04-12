package jussis.tribes.core.tribe;

import jussis.tribes.core.actor.Actor;
import jussis.tribes.core.physical.Item;
import jussis.tribes.core.story.TribeSymbol;

import java.util.Collection;

/**
 * a Tribe is a collection of Humans, who try to survive together in a hostile world.
 */
public class Tribe {

    public String tribename;
    public TribeSymbol tribesymbol;
    public Collection<String> stories;

    public Collection<Actor> actors;

    public Collection<Item> storage;
}
