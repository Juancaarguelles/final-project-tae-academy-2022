package com.university.model.teacher;

public class FullTimeTeacher extends Teacher
{
    private static final float BASE_SALARY = 2500f;
    private int experienceYears;

    public FullTimeTeacher(String name, String lastName, int experienceYears) {
        super(name, lastName);
        this.experienceYears = experienceYears;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    @Override
    public float calculateSalary() {
        this.salary = BASE_SALARY * (this.experienceYears * 1.1f);
        return this.salary;
    }

    @Override
    public String toString()
    {
        return super.toString()+
                "EXPERIENCE YEARS : "+this.experienceYears +"\n" +
                "TYPE : Full Time Teacher\n";
    }
}
