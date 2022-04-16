package com.university.model;

public class Person
{
    private static int ITERATOR;
    protected int id;
    protected String name;
    protected String lastName;

    static
    {
        ITERATOR = 0;
    }

    public Person(String name, String lastName)
    {
       id = ++ITERATOR;
       this.name = name;
       this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString()
    {
        return "ID : "+this.id+
                "\nNAME : "+this.name+
                "\nLAST NAME : "+this.lastName+"\n";
    }
}
