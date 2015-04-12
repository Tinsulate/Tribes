package jussis.tribes.core.mechanic;

/**
 * Anything which is done is performed.
 */
public interface Performable<T, S> {

    T perform(T subject, S object);

}
