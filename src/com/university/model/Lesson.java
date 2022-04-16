package com.university.model;

import com.university.exceptions.CouldNotCreateException;
import com.university.exceptions.CouldNotDeleteException;
import com.university.model.teacher.Teacher;

import java.util.List;

public class Lesson
{
    private String name;
    private String classroom;
    private List<Student>students;
    private Teacher teacher;

    public Lesson(String name, String classroom, Teacher teacher) {
        this.name = name;
        this.classroom = classroom;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
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

    public String listAll()
    {

        StringBuilder str = new StringBuilder();

        if(this.students.size()>0) {
            for (Student current : this.students)
                str.append(current).append("\n");
        }
        else
            str.append("THERE IS NO STUDENTS YET");

        return str.toString();
    }

    @Override
    public String toString()
    {
        return "NAME : "+this.name+
                "\nCLASSROOM : "+this.classroom+
                "\nSTUDENTS : "+listAll()+
                "\nTEACHER : "+this.teacher+"\n";

    }
}
