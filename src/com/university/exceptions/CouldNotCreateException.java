package com.university.exceptions;

public class CouldNotCreateException extends Exception
{
    public static final String NOT_CREATED_MSG = "--There are problems to save the object--";

    public CouldNotCreateException(String msg)
    {
        super(msg);
    }
}
