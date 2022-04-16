package com.university.model.teacher;

public class FullTimeTeacher extends Teacher
{
    private static final float BASE_SALARY = 2500f;
    private int experienceYears;

    public FullTimeTeacher(String name, String lastName, float salary, int activeHours) {
        super(name, lastName, salary);
        this.experienceYears = activeHours;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    @Override
    public void calculateSalary() {
        this.salary = BASE_SALARY * (this.experienceYears * 1.1f);
    }

    @Override
    public String toString()
    {
        return super.toString()+
                "EXPERIENCE YEARS : "+this.experienceYears +"\n";
    }
}
