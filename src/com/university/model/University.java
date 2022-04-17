package com.university.model;

import com.university.exceptions.CouldNotCreateException;
import com.university.exceptions.CouldNotDeleteException;
import com.university.interfaces.ILesson;
import com.university.interfaces.IStudent;
import com.university.interfaces.ITeacher;
import com.university.model.teacher.Teacher;

import java.util.ArrayList;
import java.util.List;

public class University implements ILesson, IStudent, ITeacher
{
    private List<Lesson>classes;
    private List<Student>students;
    private List<Teacher>teachers;

    public University()
    {
        this.classes = new ArrayList<>();
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }


    @Override
    public boolean addStudent(Student student) throws CouldNotCreateException
    {
        if(student != null)
        {
            this.students.add(student);
            return true;
        }
        throw new CouldNotCreateException(CouldNotCreateException.NOT_CREATED_MSG);
    }

    @Override
    public boolean deleteStudent(int index) throws CouldNotDeleteException
    {
        if(this.students.size() <= 0 || index < 0 || index >= this.students.size())
            throw new CouldNotDeleteException(CouldNotDeleteException.NOT_DELETED_MSG);

        this.students.remove(index);
        return true;
    }

    @Override
    public String listAllStudents() {
        StringBuilder str = new StringBuilder();

        if(this.students.size()>0) {
            for (int i = 0; i < this.students.size(); i++)
                str.append("\t<<"+(i+1)+">>").append("\n"+this.students.get(i)).append("\n");
        }
        else
            str.append("THERE IS NO STUDENTS YET");

        return str.toString();
    }


    @Override
    public boolean addLesson(Lesson lesson) throws CouldNotCreateException {
        if(!lesson.getName().equals(null))
        {
            this.classes.add(lesson);
            return true;
        }
        throw  new CouldNotCreateException(CouldNotCreateException.NOT_CREATED_MSG);
    }

    @Override
    public boolean deleteLesson(int index) throws CouldNotDeleteException {
        if(index < 0 || index >= this.classes.size())
            throw new CouldNotDeleteException(CouldNotDeleteException.NOT_DELETED_MSG);

        this.classes.remove(index);
        return true;
    }

    @Override
    public boolean addStudentToLesson(int lessonIndex, Student student)
    {
        try
        {
            this.classes.get(lessonIndex).addStudent(student);
            return true;
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean deleteStudentFromLesson(int lessonIndex, int studentIndex) {
        try
        {
            this.classes.get(lessonIndex).deleteStudent(studentIndex);
            return true;
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public String listAllLessons() {
        StringBuilder str = new StringBuilder();

        if(this.classes.size()>0)
        {
            for(Lesson current : this.classes)
                str.append(current).append("\n");
        }
        else
            str.append("THERE IS NO CLASSES YET");

        return str.toString();
    }

    @Override
    public boolean addTeacher(Teacher teacher) throws CouldNotCreateException {
        if(!teacher.getName().equals(null))
        {
            this.teachers.add(teacher);
            return true;
        }
        throw  new CouldNotCreateException(CouldNotCreateException.NOT_CREATED_MSG);
    }

    @Override
    public boolean deleteTeacher(int index) throws CouldNotDeleteException {
        if(index < 0 || index >= this.teachers.size())
            throw new CouldNotDeleteException(CouldNotDeleteException.NOT_DELETED_MSG);

        this.teachers.remove(index);
        return true;
    }

    @Override
    public String listAllTeachers() {
        StringBuilder str = new StringBuilder();

        if(this.teachers.size()>0)
        {
            for(Teacher current : this.teachers)
                str.append(current).append("\n");
        }
        else
            str.append("THERE IS NO TEACHERS YET");

        return str.toString();
    }

    public List<Lesson> getClasses() {
        return classes;
    }

    public void setClasses(List<Lesson> classes) {
        this.classes = classes;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

}
