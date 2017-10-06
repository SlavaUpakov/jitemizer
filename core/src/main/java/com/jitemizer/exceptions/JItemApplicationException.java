package com.jitemizer.exceptions;

/**
 * base jItemizer exception
 *
 */
public class JItemApplicationException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public JItemApplicationException(final String message) {
        super(message);
    }
}
