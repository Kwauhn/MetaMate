package metasystem.infrastructure.pole;

import metasystem.infrastructure.Infrastructure;

/**
 * Any kind of pole that extends from the ground.
 *
 * @author Kwauhn
 * @version 0.0.1-pre-alpha
 */
public abstract class Pole extends Infrastructure {

    private final double taper;

    /**
     * Constructs a Pole with the given Material and taper.
     *
     * @param material Material of the Pole
     * @param taper taper of the pole in % (0% being none, 100% being a perfect point)
     */
    public Pole(final Material material, final double taper) {
        super(material);
        this.taper = taper;
    }

    /**
     * Gets the taper of the Pole.
     *
     * @return the taper of the pole in % (0% being none, 100% being a perfect point)
     */
    public double getTaper() {
        return taper;
    }
}
