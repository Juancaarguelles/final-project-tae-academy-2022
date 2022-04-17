package com.university.exceptions;

public class DuplicatedStudentException extends Exception
{
    public static final String DUPLICATED_STUDENT_MSG = "--Student already exists--";

    public DuplicatedStudentException(String msg)
    {
        super(msg);
    }
}
