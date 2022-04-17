package com.university.exceptions;

public class CouldNotDeleteException extends Exception
{
    public static final String NOT_DELETED_MSG = "--There are problems to delete the object--";
    public static final String SPECIFIED_PROBLEM_MSG = "There is no relation between these objects--";

    public CouldNotDeleteException(String msg)
    {
        super(msg);
    }
}
