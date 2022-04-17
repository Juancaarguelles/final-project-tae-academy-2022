package com.university.controller;

import com.university.exceptions.CouldNotCreateException;
import com.university.model.Student;
import com.university.model.University;

public class UniversityController
{
    private static UniversityController universityController;
    private static String RESPONSE_MSG;
    private University university;

    static
    {
        RESPONSE_MSG = "";
    }

    private UniversityController()
    {
        this.university = new University();
    }

    public static UniversityController getInstance()
    {
        if(universityController == null)
            universityController = new UniversityController();
        return universityController;
    }

    public String addStudent(Student student)
    {
        RESPONSE_MSG = "";
        try
        {
            if(this.university.addStudent(student))
                RESPONSE_MSG = "Student "+student.getName()+" added succesfully";
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
            RESPONSE_MSG = "Student "+student.getName()+" couldn't be added";
        }
        return RESPONSE_MSG;
    }

    public String deleteStudent(int index)
    {
        RESPONSE_MSG = "";

        try {
            if(this.university.deleteStudent(index))
                RESPONSE_MSG = "Student was deleted succesfully";
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
            RESPONSE_MSG = "Student could not be deleted";
        }
        return RESPONSE_MSG;
    }

    public String listAllStudents()
    {
        return this.university.listAllStudents();
    }

    public University getUniversity(){return this.university;}
}
