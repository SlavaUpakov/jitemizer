/*
 * jItemizer
 *
 * Copyright (c) 2017 - Slava Upakov
 */

package com.jitemizer.controllers;

import com.jitemizer.exceptions.JItemApplicationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler
{
    /**
     * handles JItemApplicationException
     *
     * @param ex the thrown JItemApplicationException
     * @return ResponseEntity containing of a HTTP status and an error message
     */
    @ExceptionHandler(JItemApplicationException.class)
    public ResponseEntity<ErrorMessage> handleInvalidAuthenticationException(final Exception ex)
    {
        return new ResponseEntity<ErrorMessage>(generateErrorMessage(500, ex),
                        HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /**
     * @param status HTTP status code
     * @param ex     Exception
     * @return ErrorMessage
     */
    private ErrorMessage generateErrorMessage(final int status, final Exception ex)
    {
        return new ErrorMessage(status, ex.getClass().getName(), ex.getMessage());
    }
}