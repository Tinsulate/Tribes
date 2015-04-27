package jussis.tribes.core.gathering;

/**
 * Issue is a problem, plan or ceremony, to which the tribe must react
 */
public class TribalIssue {


    private final ProposalInfo proposal;

    public IssueStatus status;
    public IssueOutcome outcome;

    public TribalIssue(String issueName, String issueDescription) {
        this.status = IssueStatus.PROPOSED;
        proposal = new ProposalInfo(issueName);
    }

    public ProposalInfo startProposal() {
        status = IssueStatus.IN_VOTE;
        return proposal;
    }

    public void endProposal(IssueOutcome outcome) {
        this.outcome = outcome;
        status = IssueStatus.RESOLVED;
    }

    private class ProposalInfo {
        private final String issueName;

        private ProposalInfo(String issueName) {
            this.issueName = issueName;
        }
    }
}
