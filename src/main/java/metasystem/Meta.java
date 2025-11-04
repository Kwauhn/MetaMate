package metasystem;

/**
 * A physical object or visual cue captured in a Google Street View panorama.
 *
 * @author Kwauhn
 */
public abstract class Meta {

    private static int sequence = 0;

    private final int id;

    /**
     * Constructs a Meta with a unique ID and increments the ID sequence.
     */
    public Meta() {
        id = sequence++;
    }

    /**
     * Gets this Meta's ID.
     *
     * @return a numerical identifier, ID
     */
    public int getID() {
        return id;
    }
}
