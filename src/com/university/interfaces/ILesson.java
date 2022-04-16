package com.university.interfaces;

import com.university.exceptions.CouldNotCreateException;
import com.university.exceptions.CouldNotDeleteException;
import com.university.model.Lesson;

public interface ILesson
{
    boolean addLesson(Lesson lesson) throws CouldNotCreateException;
    boolean deleteLesson(int index) throws CouldNotDeleteException;
    String listAllLessons();
}
