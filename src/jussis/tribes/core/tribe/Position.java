package jussis.tribes.core.tribe;

/**
 * Position is a vacancy in a tribe. A tribe to be fulfilled.
 */
public class Position {

    public Role role;

    public boolean isOpen() {
        return role.areTribePrequisitePositionsFulfilled();
    }

    public boolean isFillable() {
        return areThereResourcesForPositionToBeFulfilled();
    }

    private boolean areThereResourcesForPositionToBeFulfilled() {
        return false; //TBD
    }


}
