package com.university.model.teacher;

public class PartTimeTeacher extends Teacher
{
    private static final float BASE_SALARY = 30f;
    private int activeHours;

    public PartTimeTeacher(String name, String lastName, int activeHours) {
        super(name, lastName);
        this.activeHours = activeHours;
    }

    public int getActiveHours() {
        return activeHours;
    }

    public void setActiveHours(int activeHours) {
        this.activeHours = activeHours;
    }

    @Override
    public float calculateSalary() {
        this.salary = BASE_SALARY * this.activeHours;
        return this.salary;
    }

    @Override
    public String toString()
    {
        return super.toString()+
                "ACTIVE HOURS : "+this.activeHours+"\n"+
                "TYPE : Part Time Teacher\n";
    }
}
