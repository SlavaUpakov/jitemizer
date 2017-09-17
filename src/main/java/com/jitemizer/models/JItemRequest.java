/*
 * jItemizer
 *
 * Copyright (c) 2017 - Slav Upakov
 */

package com.jitemizer.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Request that is send to JItemEndpoint
 *
 */
public class JItemRequest implements Serializable
{
    private static final long serialVersionUID = 1L;

    @NotNull
    @JsonProperty("name")
    private String name;

    @NotNull
    private String code;

    @NotNull
    @JsonProperty("redirect_uri")
    private String redirectUri;

    public JItemRequest()
    {

    }

    public JItemRequest(final String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(final String name)
    {
        this.name = name;
    }
}
