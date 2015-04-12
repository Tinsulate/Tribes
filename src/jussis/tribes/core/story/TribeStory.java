package jussis.tribes.core.story;

import java.util.LinkedList;

/**
 * Story of a Single tribe
 */
public class TribeStory {

    public final LinkedList<Chapter> story = new LinkedList<>();

    public void addTribalIssue(Chapter chapter) {
        story.add(chapter);
    }
}
