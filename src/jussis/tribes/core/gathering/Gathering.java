package jussis.tribes.core.gathering;


import jussis.tribes.core.actor.Actor;
import jussis.tribes.core.mechanic.GameCalendar;
import jussis.tribes.core.mechanic.GameDateTime;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Gathering is a gathering of a tribe to the same Place to elect leaders, resolve problems, perform ceremonies etc.
 */
public class Gathering {

    private GameCalendar calendar;

    public GameDateTime began;
    public GameDateTime ended;

    private final Collection<TribalIssue> issues = new ArrayList<>();
    private final Collection<Actor> peoplePresent;

    public Gathering(GameCalendar calendar, Collection<Actor> peoplePresent) {
        this.calendar = calendar;
        this.peoplePresent = peoplePresent;
    }

    public static Gathering announceGathering(Collection<Actor> peoplePresent, GameCalendar calendar) {
        return new Gathering(calendar, peoplePresent);
    }

    public void beginGathering() {
        assertGatheringStartable();
        began = calendar.now();
        resolveIssues();
        ended = calendar.now();
    }

    private void assertGatheringStartable() {
        if (issues.isEmpty())
            throw new IllegalStateException("No issues present");
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
