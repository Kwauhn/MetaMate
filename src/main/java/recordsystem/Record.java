package recordsystem;

import metasystem.Meta;

import java.net.URI;
import java.util.Date;


public class Record {

    private Meta meta;
    private URI locationURL;
    private String image;
    private Date date;

    /**
     * Constructs record of a meta associated with a Google Street View location.
     *
     * @author Kwauhn
     * @param meta meta spotted
     * @param locationURL URL of Google Street View location
     * @param date date that the record was created on
     */
    public Record(Meta meta, URI locationURL, Date date) { }

    /**
     * Constructs record of a meta associated with a Google Street View location.
     *
     * @author Kwauhn
     * @param meta meta spotted
     * @param locationURL URL of Google Street View location
     * @param image name of the file containing the reference image
     * @param date date that the record was created on
     */
    public Record(Meta meta, URI locationURL, String image, Date date) { }
}
