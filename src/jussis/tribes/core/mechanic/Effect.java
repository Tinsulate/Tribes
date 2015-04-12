package jussis.tribes.core.mechanic;

/**
 * effect can be anything which affects a calculation
 */
public interface Effect<T, S> {

    T calculate(T calculation, S action);
}
