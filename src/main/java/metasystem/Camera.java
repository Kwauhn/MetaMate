package metasystem;

/**
 * A camera quality of a Google Street View location.
 *
 * @author Kwauhn
 * @version 0.0.1-pre-alpha
 */
public class Camera extends Meta {

    /**
     * Generation of the camera used to capture a Google Street View location.
     */
    public enum Generation {
        FIRST,
        SECOND,
        THIRD,
        FOURTH,
        LOW_CAM,
        SHIT_CAM,
        SMALL_CAM
    }

    private final Generation generation;

    /**
     * Constructs a Camera with the given Generation.
     *
     * @param generation the Generation of the Camera
     */
    public Camera(final Generation generation) {
        this.generation = generation;
    }

    /**
     * Gets the Generation of the Camera.
     *
     * @return the Generation of the Camera
     */
    public Generation getGeneration() {
        return generation;
    }
}
