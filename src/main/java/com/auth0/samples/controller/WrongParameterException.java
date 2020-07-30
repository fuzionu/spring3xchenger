package com.auth0.samples.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "wrong param")
public class WrongParameterException extends RuntimeException
{
    public WrongParameterException(String message)
    {
        super(message);
    }
}
