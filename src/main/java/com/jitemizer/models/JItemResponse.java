/*
 * jItemizer
 *
 * Copyright (c) 2017 - Slava Upakov
 */

package com.jitemizer.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * response that is returned by the JItemEndpoint
 *
 */
public class JItemResponse implements Serializable
{
    private static final long serialVersionUID = 1L;

    @NotNull
    private String sub;

    @JsonProperty("name")
    private String name;

    public JItemResponse()
    {

    }

    public JItemResponse(final String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(final String name)
    {
        this.name = name;
    }
}
