package com.university.interfaces;

import com.university.exceptions.CouldNotCreateException;
import com.university.exceptions.CouldNotDeleteException;
import com.university.model.Student;

public interface IStudent
{
    boolean addStudent(Student student) throws CouldNotCreateException;
    boolean deleteStudent(int index) throws CouldNotDeleteException;
    String listAllStudents();
}
