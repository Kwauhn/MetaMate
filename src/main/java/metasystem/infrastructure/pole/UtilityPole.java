package metasystem.infrastructure.pole;

import metasystem.infrastructure.feature.Top;

/**
 * A Pole that connects utility lines.
 *
 * @author Kwauhn
 * @version 0.0.1-pre-alpha
 */
public class UtilityPole extends Pole {

    //TODO: Add crossarms, bands, plates, labels, notches, dots, & socks

    private final Top top;

    /**
     * Constructs a UtilityPole with the given Material, taper, and Top.
     *
     * @param material Material of the UtilityPole
     * @param taper taper of the UtilityPole in % (0% being none, 100% being a perfect point)
     * @param top Top of the UtilityPole
     */
    public UtilityPole(final Material material, final double taper, final Top top) {
        super(material, taper);
        this.top = top;
    }

    /**
     * Gets the Top of the UtilityPole.
     *
     * @return the Top of the UtilityPole
     */
    public Top getTop() {
        return top;
    }
}
