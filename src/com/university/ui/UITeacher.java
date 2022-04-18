package com.university.ui;

import com.university.Main;
import com.university.model.Student;
import com.university.model.teacher.FullTimeTeacher;
import com.university.model.teacher.PartTimeTeacher;
import com.university.model.teacher.Teacher;

public class UITeacher
{
    public static void showMenu()
    {
        int option = 0;

        do {
            System.out.println("\nTEACHER MENU");
            System.out.println("1. Register Teacher" +
                    "\n2. Delete Teacher" +
                    "\n3. List Teacher" +
                    "\n4. Go to Menu");
            System.out.print("Type the option::");
            option = Main.input.nextInt();

            switch (option)
            {
                case 1:
                    System.out.println(Main.universityController.addTeacher(createTeacher()));
                    break;
                case 2:
                    System.out.println(Main.universityController.deleteTeacher(selectTeacher()));
                    break;
                case 3:
                    System.out.println(Main.universityController.listAllTeachers());
                    break;
                case 4:
                    System.out.println("Going back to menu");
                    break;
                default:
                    System.out.println("<<Type a valid option>>");
                    break;
            }
        }while (option != 4);
    }

    private static Teacher createTeacher()
    {
        int option = 0;
        Teacher teacher = null;
        do {
            System.out.println("\n1. Full time teacher" +
                    "\n2 .Part time teacher\n");
            System.out.print("Type option::");

            if(option < 1 || option > 2)
                System.out.println("Type a valid option please");

        }while(option < 1 || option > 2);

        System.out.print("Type the name : ");
        String name = Main.input.next();
        System.out.print("Type the lastName : ");
        String lastName = Main.input.next();


        switch (option)
        {
            case 1:
                System.out.print("Type the experience in years : ");
                int experienceYears = Main.input.nextInt();

                teacher = new FullTimeTeacher(name, lastName, experienceYears);
                break;

            case 2:
                System.out.print("Type the amount of hours per week : ");
                int amountHours = Main.input.nextInt();
                teacher = new PartTimeTeacher(name, lastName, amountHours);
                break;
        }
        return teacher;
    }

    public static int selectTeacher()
    {
        int option = 0;
        if(Main.universityController.getUniversity().getTeachers().size()>0) {
            do {
                System.out.println("\n" + Main.universityController.listAllTeachers());
                System.out.print("Type the <<index>>::");
                option = Main.input.nextInt();

                if (option < 1 || option > Main.universityController.getUniversity().getTeachers().size())
                    System.out.println("Please select a valid index");

            } while (option < 1 || option > Main.universityController.getUniversity().getTeachers().size());
        }

        return --option;
    }

}
