package com.university.model;

public class Student extends Person
{
    private int age;

    public Student(String name, String lastName, int age)
    {
        super(name, lastName);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return super.toString()+
                "AGE : "+this.age+"\n";
    }
}
