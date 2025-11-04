package metasystem;

import java.util.Objects;

/**
 * A described colour in the HSV colour space.
 *
 * @author Kwauhn
 * @version 0.0.1-pre-alpha
 *
 * @param hue hue of the Colour (0 and 1 being red, with every other hue in-between)
 * @param saturation saturation of the Colour (0 being greyscale and 1 being full-colour)
 * @param value value of the Colour (0 being black and 1 being full brightness)
 * @param descriptor a short human-readable description of the Colour
 */
public record Colour(double hue, double saturation, double value, String descriptor) {

    public static final String RED = "Red";

    /**
     * Constructs a Colour with the given hue, saturation, value, and descriptor.
     *
     * @param hue hue of the Colour (0 and 1 being red, with every other hue in-between)
     * @param saturation saturation of the Colour (0 being greyscale and 1 being full-colour)
     * @param value value of the Colour (0 being black and 1 being full brightness)
     * @param descriptor a short human-readable description of the Colour
     */
    public Colour {
        Objects.requireNonNull(descriptor, "Colour must have a descriptor");
    }
}
