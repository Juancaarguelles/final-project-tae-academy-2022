package com.university.interfaces;

import com.university.exceptions.CouldNotCreateException;
import com.university.exceptions.CouldNotDeleteException;
import com.university.model.teacher.Teacher;

public interface ITeacher
{
    boolean addTeacher(Teacher teacher) throws CouldNotCreateException;
    boolean deleteTeacher(int index) throws CouldNotDeleteException;
    String listAllTeachers();
}
