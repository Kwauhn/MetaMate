package metasystem.infrastructure.feature;

import metasystem.infrastructure.Infrastructure;

/**
 * The top of an Infrastructure.
 *
 * @author Kwauhn
 * @version 0.0.1-pre-alpha
 */
public abstract class Top extends Infrastructure {

    /**
     * The shape of the top of an Infrastructure.
     */
    public enum Shape {
        CONE,
        BEVELLED,
        DOME,
        FLAT,
        PYRAMID,
        SLANTED,
        WEDGE,
        WEDGE_ECCENTRIC,
        UNSPECIFIED
    }

    private final Shape shape;

    /**
     * Constructs a default Top with an unspecified shape.
     */
    public Top() {
        shape = Shape.UNSPECIFIED;
    }

    /**
     * Constructs a Top with a given material and shape.
     *
     * @param material the Infrastructure.Material this Top is to be made of
     * @param shape the Shape of this Top
     */
    public Top(final Material material, final Shape shape) {
        super(material);
        this.shape = shape;
    }

    /**
     * Gets the Shape of this Top.
     *
     * @return the Shape of this Top
     */
    public Shape getShape() {
        return shape;
    }
}
