package jussis.tribes.core.gathering;

/**
 * Issue is a problem, plan or ceremony, to which the tribe must react
 */
public class TribalIssue {


    private final ProposalInfo proposal;

    public Status status;
    public IssueOutcome outcome;

    public TribalIssue(String issueName, String issueDescription) {
        this.status = Status.PROPOSED;
        proposal = new ProposalInfo(issueName);
    }

    public ProposalInfo startProposal() {
        status = Status.IN_VOTE;
        return proposal;
    }

    public void endProposal(IssueOutcome outcome) {
        this.outcome = outcome;
        status = Status.RESOLVED;
    }

    private class ProposalInfo {
        private final String issueName;

        private ProposalInfo(String issueName) {
            this.issueName = issueName;
        }
    }
}
