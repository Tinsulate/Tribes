package jussis.tribes.core.gathering;


import jussis.tribes.core.actor.Actor;
import jussis.tribes.core.mechanic.GameCalendar;
import jussis.tribes.core.mechanic.GameDateTime;
import jussis.tribes.core.physical.Place;
import jussis.tribes.core.tribe.Tribe;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Gathering is a gathering of a tribe to the same Place to elect leaders, resolve problems, perform ceremonies etc.
 */
public class Gathering {

    private GameCalendar calendar;

    public final Place place;

    public final Tribe tribe;

    public GameDateTime began;
    public GameDateTime ended;

    private final Collection<TribalIssue> issues = new ArrayList<>();
    private final Collection<Actor> peoplePresent = new ArrayDeque<>();

    public Gathering(GameCalendar calendar, Place place, Tribe tribe, GameDateTime time) {
        this.calendar = calendar;
        this.place = place;
        this.tribe = tribe;
    }

    public static Gathering announceGathering(Place place, Tribe tribe, GameDateTime time, GameCalendar calendar) {
        return new Gathering(calendar, place, tribe, time);
    }

    public void beginGathering() {
        place.getHumansPresent();
        began = calendar.now();
        resolveIssues();
        ended = calendar.now();
    }

    public void addIssue(TribalIssue issue) {

    }

    public void removeIssue(TribalIssue issue) {

    }

    private void resolveIssues() {
        for (TribalIssue issue : issues) {
            issue.resolve(peoplePresent);
        }
    }
}
