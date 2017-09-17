/*
 * jitemizer
 *
 * Copyright (c) 2017 - Slava Upakov
 */

package com.jitemizer.controllers;

/**
 * ErrorMessage needed for GlobalExceptionHandler
 *
 */
public class ErrorMessage
{

    private int status;
    private String type;
    private String message;

    public ErrorMessage() {

    }

    public ErrorMessage(final int status, final String type, final String message) {
        this.status = status;
        this.type = type;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(final int status)
    {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }
}