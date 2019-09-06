package net.stedin.werkorderservice.exceptions;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response.Status;

/**
 * ExceptionMapper
 */
public class WerkorderNotFoundException extends WebApplicationException {
    static final long serialVersionUID = -5759702797487833065L;

    public WerkorderNotFoundException() {
        super(Status.NOT_FOUND);
    }
}