package com.university.controller;

import com.university.exceptions.CouldNotCreateException;
import com.university.model.Lesson;
import com.university.model.Student;
import com.university.model.University;
import com.university.model.teacher.Teacher;

public class UniversityController
{
    private static final String PROBLEM_MSG = "Something has gone wrong, check that exist students and classes";

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

    public String addTeacherToLesson(int lessonIndex, int teacherIndex)
    {
        RESPONSE_MSG = "";

        try
        {
            Lesson lesson = this.university.getClasses().get(lessonIndex);
            Teacher teacher = this.university.getTeachers().get(teacherIndex);
            if (this.university.addTeacherToLesson(lessonIndex, teacherIndex))
                RESPONSE_MSG = "Teacher "+teacher.getName()+" was registered in "+lesson.getName();
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
            RESPONSE_MSG = "Teacher wasn't registered to the lesson";
        }
        return RESPONSE_MSG;
    }

    public String deleteTeacherFromLesson(int lessonIndex)
    {
        RESPONSE_MSG = "";
        try
        {
            if (this.university.deleteTeacherFromLesson(lessonIndex)) {
                Lesson lesson = this.university.getClasses().get(lessonIndex);
                RESPONSE_MSG = "Teacher  was removed from " + lesson.getName();
            }
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
            RESPONSE_MSG = "Teacher does not exit in this subject";
        }
        return RESPONSE_MSG;
    }

    public String addStudentToLesson(int lessonIndex, int studentIndex)
    {
        RESPONSE_MSG = "";

        try {
            if(this.university.addStudentToLesson(lessonIndex, studentIndex)) {
                Lesson lesson = this.university.getClasses().get(lessonIndex);
                Student student = this.university.getStudents().get(studentIndex);
                RESPONSE_MSG = "Student " + student.getName() + " was registered to " + lesson.getName();
            }
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
            RESPONSE_MSG = PROBLEM_MSG;
        }
        return RESPONSE_MSG;
    }

    public String deleteStudentFromLesson(int lessonIndex, int studentIndex)
    {
        RESPONSE_MSG = "";

        try {
            if(this.university.deleteStudentFromLesson(lessonIndex, studentIndex)) {
                Student student = this.university.getStudents().get(studentIndex);
                Lesson lesson = this.university.getClasses().get(lessonIndex);
                RESPONSE_MSG = "Student " + student.getName() + " was removed from " + lesson.getName();
            }
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
            RESPONSE_MSG = PROBLEM_MSG;
        }
        return RESPONSE_MSG;
    }

    public String listAllLessons()
    {
        return this.university.listAllLessons();
    }

    public String listAllStudentsFromLesson(int lessonIndex)
    {
        return this.university.listAllStudentsFromLesson(lessonIndex);
    }

    public String addTeacher(Teacher teacher)
    {
        RESPONSE_MSG = "";
        try
        {
            if(this.university.addTeacher(teacher))
                RESPONSE_MSG = "Teacher "+teacher.getName()+" added succesfully";
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
            RESPONSE_MSG = "Teacher "+teacher.getName()+" couldn't be added";
        }
        return RESPONSE_MSG;
    }
    public String deleteTeacher(int index)
    {
        RESPONSE_MSG = "";
        try
        {
            if(this.university.deleteTeacher(index))
                RESPONSE_MSG = "Teacher was removed succesfully";
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
            RESPONSE_MSG = "Teacher couldn't be removed";
        }
        return RESPONSE_MSG;
    }

    public String listAllTeachers()
    {
        return this.university.listAllTeachers();
    }

    public University getUniversity(){return this.university;}
}
