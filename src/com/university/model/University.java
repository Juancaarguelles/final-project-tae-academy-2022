package com.university.model;

import com.university.exceptions.CouldNotCreateException;
import com.university.exceptions.CouldNotDeleteException;
import com.university.model.teacher.Teacher;

import java.util.ArrayList;
import java.util.List;

public class University
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

    public boolean addClass(Lesson lesson) throws CouldNotCreateException
    {
        if(!lesson.getName().equals(null))
        {
            this.classes.add(lesson);
            return true;
        }
        throw  new CouldNotCreateException(CouldNotCreateException.NOT_CREATED_MSG);
    }

    public boolean deleteClass(int index)throws CouldNotDeleteException
    {
        if(index < 0 || index >= this.classes.size())
            throw new CouldNotDeleteException(CouldNotDeleteException.NOT_DELETED_MSG);

        this.classes.remove(index);
        return true;
    }

    public String listClasses()
    {
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

    public boolean addStudent(Student student) throws CouldNotCreateException
    {
        if(student != null)
        {
            this.students.add(student);
            return true;
        }
        throw new CouldNotCreateException(CouldNotCreateException.NOT_CREATED_MSG);
    }

    public boolean deleteStudent(int index) throws CouldNotDeleteException
    {
        if(index < 0 || index >= this.students.size())
            throw new CouldNotDeleteException(CouldNotDeleteException.NOT_DELETED_MSG);

        this.students.remove(index);
        return true;
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
