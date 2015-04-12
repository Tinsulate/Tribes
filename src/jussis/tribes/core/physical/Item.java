package jussis.tribes.core.physical;


import jussis.tribes.core.actor.Actor;
import jussis.tribes.core.mechanic.Effect;
import jussis.tribes.core.mechanic.Performable;
import jussis.tribes.core.tribe.Approvement;
import jussis.tribes.core.tribe.Position;

import java.util.Collection;
import java.util.Map;

/**
 * Item is something actors can carry and which can be stored in to a storage for example.
 */
public class Item {

    public Weight weight;
    public String name;
    public String description;

    //Item might have effects on performing in various roles
    public Map<Performable, Effect> effects;

    /**
     * A Job is position assigned to an Actor
     */
    public static class Job {

        public Position ropositionle;
        public Actor actor;

        //TODO: Think about the approvement mechanism.
        // When are approvements gained/lost? With contests?
        // Is there a maximum number of approments? Are they inherited to children?
        // What effect do they have on job performance/other things?

        /**
         * Proposal : approvements are gained from other members.
         * Actor cannot lose approval for a job.
         * They enhance performance in a tribe, but hurt the performance in other tasks?
         */
        public Collection<Approvement> approvements;
    }
}
