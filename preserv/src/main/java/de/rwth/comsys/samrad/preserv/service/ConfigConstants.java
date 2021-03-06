package de.rwth.comsys.samrad.preserv.service;

/**
 * Created by Sam on 9/7/2014.
 */
public class ConfigConstants {

    // Milliseconds per second
    public static final int MILLISECONDS_PER_SECOND = 1000;
    // Update frequency in seconds
    private static final int UPDATE_INTERVAL_IN_SECONDS = 10;
    // Update frequency in milliseconds
    public static final long UPDATE_INTERVAL = MILLISECONDS_PER_SECOND * UPDATE_INTERVAL_IN_SECONDS;
    // The fastest update frequency, in seconds
    private static final int FASTEST_INTERVAL_IN_SECONDS = 5;
    // A fast frequency ceiling in milliseconds
    public static final long FASTEST_INTERVAL = MILLISECONDS_PER_SECOND * FASTEST_INTERVAL_IN_SECONDS;
    // Service pulse frequency in seconds
    public static final long PULSE_INTERVAL_IN_SECOND = 60;
    // Service pulse frequency in milliseconds
    public static final long PULSE_INTERVAL = MILLISECONDS_PER_SECOND * PULSE_INTERVAL_IN_SECOND;


    /**
     * Suppress default constructor for noninstantiability
     */
    private ConfigConstants() {
        throw new AssertionError();
    }
}
