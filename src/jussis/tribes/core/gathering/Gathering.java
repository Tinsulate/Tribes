package jussis.tribes.core.gathering;


import jussis.tribes.core.actor.Actor;
import jussis.tribes.core.mechanic.GameCalendar;
import jussis.tribes.core.mechanic.GameDateTime;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Gathering is a gathering of a tribe to the same Place to elect leaders, resolve problems, perform ceremonies etc.
 */
public class Gathering {

    private GameCalendar calendar;

    public GameDateTime began;
    public GameDateTime ended;

    public Status status;

    private final Collection<TribalIssue> issues = new ArrayList<>();
    private final Collection<Actor> peoplePresent;

    public Gathering(GameCalendar calendar, Collection<Actor> peoplePresent) {
        this.calendar = calendar;
        this.peoplePresent = peoplePresent;
        status = Status.PROPOSED;
    }

    public static Gathering announceGathering(Collection<Actor> peoplePresent, GameCalendar calendar) {
        return new Gathering(calendar, peoplePresent);
    }

    public Collection<TribalIssue> beginGathering() {
        assertGatheringStartable();
        status = Status.IN_VOTE;
        began = calendar.now();
        return Collections.unmodifiableCollection(issues);
    }

    public void endGathering() {
        status = Status.RESOLVED;
        ended = calendar.now();
    }

    private void assertGatheringStartable() {
        if (issues.isEmpty())
            throw new IllegalStateException("No issues present");
    }

    public void addIssue(TribalIssue issue) {
        issues.add(issue);
    }

    public void removeIssue(TribalIssue issue) {
        issues.remove(issue);
    }

    public Collection<TribalIssue> getIssues() {
        return Collections.unmodifiableCollection(issues);
    }

}
