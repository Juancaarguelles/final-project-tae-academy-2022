package com.university.model.teacher;

import com.university.model.Person;

public abstract class Teacher extends Person
{
    protected float salary;

    public Teacher(String name, String lastName, float salary) {
        super(name, lastName);
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public abstract void calculateSalary();

    @Override
    public String toString()
    {
        return super.toString()+
                "SALARY : "+this.salary+"\n";
    }
}
