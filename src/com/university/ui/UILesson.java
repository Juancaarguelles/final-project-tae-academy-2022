package com.university.ui;

import com.university.Main;
import com.university.model.Lesson;
import com.university.model.Student;

public class UILesson
{
    public static void showMenu()
    {
        int option = 0;

        do {
            System.out.println("\nSTUDENT MENU");
            System.out.println("1. Register Lesson" +
                    "\n2. Delete Lesson" +
                    "\n3. Add teacher to lesson" +
                    "\n4. Add Student to lesson" +
                    "\n5. Delete Student from lesson" +
                    "\n6. Show all lessons" +
                    "\n7. Go back to menu");
            System.out.print("Type the option::");
            option = Main.input.nextInt();

            switch (option)
            {
                case 1:
                    System.out.println(Main.universityController.addLesson(createLesson()));
                    break;
                case 2:
                    System.out.println(Main.universityController.deleteLesson(selectLesson()));
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println(Main.universityController.listAllLessons());
                    break;
                case 7:
                    System.out.println("Going back to Main menu");
                    break;
                default:
                    System.out.println("<<Please type a valid option>>");
                    break;
            }

        }while (option != 7);
    }

    private static Lesson createLesson()
    {
        System.out.print("Type the name : ");
        String name = Main.input.next();
        System.out.print("Type the classroom : ");
        String classroom = Main.input.next();
        return new Lesson(name, classroom);
    }

    private static int selectLesson()
    {
        int option = 0;
        if(Main.universityController.getUniversity().getClasses().size()>0)
            do {
                System.out.println("\n"+Main.universityController.listAllLessons());
                System.out.print("Type the <<index>>::");
                option = Main.input.nextInt();

                if(option < 1 || option > Main.universityController.getUniversity().getClasses().size())
                    System.out.println("Please select a valid index");

            }while (option < 1 || option > Main.universityController.getUniversity().getClasses().size());

        return --option;
    }
}
