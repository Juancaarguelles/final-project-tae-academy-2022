package com.university.controller;

import com.university.exceptions.CouldNotCreateException;
import com.university.model.Lesson;
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

    public String addLesson(Lesson lesson)
    {
        RESPONSE_MSG = "";
        try
        {
            if(this.university.addLesson(lesson))
                RESPONSE_MSG = "Lesson "+lesson.getName()+" added succesfully";
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
            RESPONSE_MSG = "Lesson "+lesson.getName()+" couldn't be added";
        }
        return RESPONSE_MSG;
    }

    public String deleteLesson(int index)
    {
        RESPONSE_MSG = "";

        try {
            if(this.university.deleteLesson(index))
                RESPONSE_MSG = "Class was deleted succesfully";
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
            RESPONSE_MSG = "Class could not be deleted";
        }
        return RESPONSE_MSG;
    }

    public String addStudentToLesson(int lessonIndex, Student student)
    {
        Lesson lesson = this.university.getClasses().get(lessonIndex);
        RESPONSE_MSG = "";

        try {
            if(this.university.addStudentToLesson(lessonIndex, student))
                RESPONSE_MSG = "Student "+student.getName()+" was registered to "+lesson.getName();
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
            RESPONSE_MSG = "Student "+student.getName()+" couldn't be added to "+lesson.getName();
        }
        return RESPONSE_MSG;
    }

    public String deleteStudentFromLesson(int lessonIndex, int studentIndex)
    {
        Student student = this.university.getStudents().get(studentIndex);
        Lesson lesson = this.university.getClasses().get(lessonIndex);
        RESPONSE_MSG = "";

        try {
            if(this.university.deleteStudentFromLesson(lessonIndex, studentIndex))
                RESPONSE_MSG = "Student "+student.getName()+" was removed from "+lesson.getName();
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
            RESPONSE_MSG = "Student "+student.getName()+" couldn't be removed from "+lesson.getName();
        }
        return RESPONSE_MSG;
    }

    public String listAllLessons()
    {
        return this.university.listAllLessons();
    }

    public University getUniversity(){return this.university;}
}
