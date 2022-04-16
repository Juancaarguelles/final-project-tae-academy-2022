package com.university.model.teacher;

public class PartTimeTeacher extends Teacher
{
    private static final float BASE_SALARY = 30f;
    private int activeHours;

    public PartTimeTeacher(String name, String lastName, float salary, int activeHours) {
        super(name, lastName, salary);
        this.activeHours = activeHours;
    }

    public int getActiveHours() {
        return activeHours;
    }

    public void setActiveHours(int activeHours) {
        this.activeHours = activeHours;
    }

    @Override
    public void calculateSalary() {
        this.salary = BASE_SALARY * this.activeHours;
    }

    @Override
    public String toString()
    {
        return super.toString()+
                "ACTIVE HOURS : "+this.activeHours+"\n";
    }
}
