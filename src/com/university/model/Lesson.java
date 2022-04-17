package com.university.model;

import com.university.exceptions.CouldNotCreateException;
import com.university.exceptions.CouldNotDeleteException;
import com.university.exceptions.DuplicatedStudentException;
import com.university.interfaces.IStudent;
import com.university.model.teacher.Teacher;

import javax.transaction.xa.XAException;
import java.util.List;

public class Lesson implements IStudent
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

    @Override
    public boolean addStudent(Student student) throws CouldNotCreateException
    {
        if(!this.students.contains(student))
        {
            this.students.add(student);
            return true;
        }
        throw new CouldNotCreateException(DuplicatedStudentException.DUPLICATED_STUDENT_MSG);
    }

    @Override
    public boolean deleteStudent(int index) throws CouldNotDeleteException
    {
        if(index < 0 || index >= this.students.size())
            throw new CouldNotDeleteException(CouldNotDeleteException.NOT_DELETED_MSG);

        this.students.remove(index);
        return true;
    }

    @Override
    public String listAllStudents() {
        StringBuilder str = new StringBuilder();

        if(this.students.size()>0) {
            for (Student current : this.students)
                str.append(current).append("\n");
        }
        else
            str.append("THERE IS NO STUDENTS YET");

        return str.toString();
    }

    public boolean findStudent(int id)
    {
        for(Student current : this.students)
        {
            if(current.id == id)
                return true;
        }
        return false;
    }


    @Override
    public String toString()
    {
        return "NAME : "+this.name+
                "\nCLASSROOM : "+this.classroom+
                "\nSTUDENTS : "+listAllStudents()+
                "\nTEACHER : "+this.teacher+"\n";

    }
}
