package jussis.tribes.core.tribe;

import jussis.tribes.core.mechanic.Performable;

import java.util.List;

/**
 * A Tribe needs it's members to take on various responsibilities which can and need to be filled for the tribe to survive and thrive. A Role describes those positions.
 */
public class Role {

    public String name;
    public String description;

    public List<Performable> possibleActions;


    public boolean areTribePrequisitePositionsFulfilled() {
        return false; //TBD
    }
}
