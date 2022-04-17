package com.university.ui;

import com.university.Main;
import com.university.controller.UniversityController;
import com.university.model.Student;

import java.util.Scanner;

public class UIStudent
{
    public static void showMenu()
    {
        int option = 0;

        do {
            System.out.println("\nSTUDENT MENU");
            System.out.println("1. Register Student" +
                    "\n2. Delete Student" +
                    "\n3. List Student" +
                    "\n4. Go to Menu");
            System.out.print("Type the option::");
            option = Main.input.nextInt();

            switch (option)
            {
                case 1:
                    System.out.println(Main.universityController.addStudent(createStudent()));
                    break;
                case 2:
                    System.out.println(Main.universityController.deleteStudent(selectStudent()));
                    break;
                case 3:
                    System.out.println(Main.universityController.listAllStudents());
                    break;
                case 4:
                    System.out.println("Going back to Main Menu");
                    break;
                default:
                    System.out.println("<<Please type a valid option>>");
                    break;
            }

        }while (option != 4);
    }

    private static Student createStudent()
    {
        System.out.print("Type the name : ");
        String name = Main.input.next();
        System.out.print("Type the lastName : ");
        String lastName = Main.input.next();
        System.out.print("Type the age : ");
        int age = Main.input.nextInt();
        return new Student(name, lastName , age);
    }

    private static int selectStudent()
    {
        int option = 0;
        if(Main.universityController.getUniversity().getStudents().size()>0)
        do {
            System.out.println("\n"+Main.universityController.listAllStudents());
            System.out.print("Type the <<index>>::");
            option = Main.input.nextInt();

            if(option < 1 || option > Main.universityController.getUniversity().getStudents().size())
                System.out.println("Please select a valid index");

        }while (option < 1 || option >1 Main.universityController.getUniversity().getStudents().size());

        return --option;
    }
}
