package com.university.interfaces;

import com.university.exceptions.CouldNotCreateException;
import com.university.exceptions.CouldNotDeleteException;
import com.university.model.Lesson;
import com.university.model.Student;

public interface ILesson
{
    boolean addLesson(Lesson lesson) throws CouldNotCreateException;
    boolean deleteLesson(int index) throws CouldNotDeleteException;
    boolean addStudentToLesson(int lessonIndex, Student student);
    boolean deleteStudentFromLesson(int lessonIndex, int studentIndex);
    String listAllLessons();
}
