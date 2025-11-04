package metasystem.infrastructure.feature;

import metasystem.infrastructure.Infrastructure;

/**
 * The capped top of an Infrastructure.
 *
 * @author Kwauhn
 * @version 0.0.1-pre-alpha
 */
public class TopCapped extends Top {

    /**
     * The rim of a Top.
     */
    public enum Rim {
        JUT,
        NONE,
        RING
    }

    private final Rim rim;

    /**
     * Constructs a TopCapped with a given Material, Shape, and Rim.
     *
     * @param material the Material of the TopCapped
     * @param shape the Shape of the TopCapped
     * @param rim the Rim of the TopCapped
     */
    public TopCapped(final Infrastructure.Material material, final Shape shape, final Rim rim) {
        super(material, shape);
        this.rim = rim;
    }

    /**
     * Gets the Rim of the TopCapped.
     *
     * @return the Rim of the TopCapped
     */
    public Rim getRim() {
        return rim;
    }
}
