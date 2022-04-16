package com.university.exceptions;

public class CouldNotDeleteException extends Exception
{
    public static final String NOT_DELETED_MSG = "--There are problems to delete the object--";

    public CouldNotDeleteException(String msg)
    {
        super(msg);
    }
}
