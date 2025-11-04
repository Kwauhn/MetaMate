package metasystem.infrastructure.pole;

import metasystem.infrastructure.feature.Top;

/**
 * A type of Pole that is used on roads/roadsides.
 *
 * @author Kwauhn
 * @version 0.0.1-pre-alpha
 */
public class Bollard extends Pole {

    //TODO: Add bands, reflectors, strips, dots, & socks

    /**
     * The cross-sectional profile of a Bollard.
     */
    public enum Profile {
        CIRCULAR,
        FLAT_THIN,
        FLAT_BOWED,
        FLAT_THICK,
        ELLIPSE,
        OCTAGONAL,
        POLYGONAL,
        SQUARE,
    }

    private final Top top;

    /**
     * Constructs a Bollard with the given Material, taper, and Top.
     *
     * @param material Material of the Bollard
     * @param taper taper of the bollard in % (0% being none, 100% being a perfect point)
     * @param top Top of the Bollard
     */
    public Bollard(final Material material, final double taper, final Top top) {
        super(material, taper);
        this.top = top;
    }

    /**
     * Gets the Top of the Bollard.
     *
     * @return Top of the Bollard
     */
    public Top getTop() {
        return top;
    }
}
