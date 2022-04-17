package com.university.interfaces;

import com.university.exceptions.CouldNotCreateException;
import com.university.exceptions.CouldNotDeleteException;
import com.university.model.Lesson;
import com.university.model.Student;
import com.university.model.teacher.Teacher;

public interface ILesson
{
    boolean addLesson(Lesson lesson) throws CouldNotCreateException;
    boolean deleteLesson(int index) throws CouldNotDeleteException;
    boolean addTeacherToLesson(int lessonIndex, Teacher teacher) throws CouldNotCreateException;
    boolean deleteTeacherFromLesson(int lessonIndex) throws CouldNotDeleteException;
    boolean addStudentToLesson(int lessonIndex, int studentIndex) throws CouldNotCreateException;
    boolean deleteStudentFromLesson(int lessonIndex, int studentIndex) throws CouldNotDeleteException;
    String listAllLessons();
    String listAllStudentsFromLesson(int lessonIndex);
}
