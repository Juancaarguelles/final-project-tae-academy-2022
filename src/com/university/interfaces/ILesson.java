package com.university.interfaces;

import com.university.exceptions.CouldNotCreateException;
import com.university.exceptions.CouldNotDeleteException;
import com.university.model.Lesson;

public interface ILesson
{
    boolean add(Lesson lesson) throws CouldNotCreateException;
    boolean delete(int index) throws CouldNotDeleteException;
    String listAll();
}
