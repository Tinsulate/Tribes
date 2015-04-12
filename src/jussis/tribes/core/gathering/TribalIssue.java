package jussis.tribes.core.gathering;

import jussis.tribes.core.actor.Actor;

import java.util.Collection;

/**
 * Issue is a problem, plan or ceremony, to which the tribe must react
 */
public class TribalIssue {

    public final String issueName;
    public final String issueDescription;

    public IssueStatus outcome;

    public TribalIssue(String issueName, String issueDescription) {
        this.issueName = issueName;
        this.issueDescription = issueDescription;
    }

    public void resolve(Collection<Actor> peoplePresent) {

    }
}
