package org.axonframework.axonserver.connector.heartbeat;

/**
 * Sanity check that verify the state of the connection with AxonServer.
 *
 * @author Sara Pellegrini
 * @since 4.2
 */
public interface ConnectionSanityCheck {

    /**
     * Returns true if the connection is still alive, false otherwise.
     *
     * @return true if the connection is still alive, false otherwise.
     */
    boolean isValid();
}
