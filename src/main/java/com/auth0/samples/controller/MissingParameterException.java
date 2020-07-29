package com.auth0.samples.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "no param")
public class MissingParameterException extends RuntimeException
{
    public MissingParameterException(String message)
    {
        super(message);
    }
}
