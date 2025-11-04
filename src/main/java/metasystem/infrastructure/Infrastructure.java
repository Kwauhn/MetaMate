package metasystem.infrastructure;

import metasystem.Meta;

/**
 * A physical piece of infrastructure.
 *
 * @author Kwauhn
 * @version 0.0.1-pre-alpha
 */
public abstract class Infrastructure extends Meta {

    /**
     * The material of an Infrastructure.
     */
    public enum Material {
        ASPHALT,
        CEMENT,
        CONCRETE,
        DIRT,
        GLASS,
        GRAVEL,
        METAL,
        METAL_GALVANIZED,
        PAINT,
        PLASTIC,
        WOOD,
        NONE,
        UNSPECIFIED
    }

    private final Material material;

    /*
     * Constructs a default Infrastructure with an unspecified material.
     */
    protected Infrastructure() {
        material = Material.UNSPECIFIED;
    }

    /**
     * Constructs an Infrastructure with the specified material.
     *
     * @param material the Material of the new Infrastructure
     */
    public Infrastructure(final Material material) {
        this.material = material;
    }

    /**
     * Gets the Infrastructure's Material.
     *
     * @return the Infrastructure's Material
     */
    public Material getMaterial() {
        return material;
    }
}
