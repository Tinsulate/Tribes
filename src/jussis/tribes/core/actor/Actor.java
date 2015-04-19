package jussis.tribes.core.actor;

import jussis.tribes.core.mechanic.Effect;
import jussis.tribes.core.mechanic.GameDateTime;
import jussis.tribes.core.physical.Item;
import jussis.tribes.core.story.ActorStory;

import java.util.Collection;

/**
 *
 */
public class Actor {

    public Name name;
    public Look body;

    public GameDateTime born;
    public GameDateTime adulthoodRitual;
    public GameDateTime died;

    public ActorStory story;

    public Sex sex;

    public Actor father;
    public Actor mother;

    public Collection<Item.Job> roles;

    public Collection<ActorProperty> talentsAndHindarances;
    public Collection<Effect> blessingsAndCurses;
    public Collection<Objective> tasks;

    public void expel() {
        //TODO
    }

    public void court() {
        //TODO
    }

    public void addJob(Item.Job job) {
        roles.add(job);
    }

}
