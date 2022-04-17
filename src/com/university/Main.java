package com.university;

import com.university.controller.UniversityController;
import com.university.model.Person;
import com.university.model.Student;
import com.university.ui.UILesson;
import com.university.ui.UIStudent;

import java.util.Scanner;

public class Main {

    public static Scanner input = new Scanner(System.in);
    public static UniversityController universityController = UniversityController.getInstance();
    public static void main(String[] args)
    {
        showMainMenu();
    }

    public static void showMainMenu()
    {
        int option = 0;

        do
        {
            System.out.println("\nWELCOME TO THE UNIVERSITY");
            System.out.println("1. Show Students Menu" +
                    "\n2. Show Lessons Menu" +
                    "\n3. Exit");

            System.out.print("Type the option::");
            option = input.nextInt();

            switch (option)
            {
                case 1:
                    UIStudent.showMenu();
                    break;
                case 2:
                    UILesson.showMenu();
                    break;
                case 3:
                    System.out.println("See you soon!");
                    break;
                default:
                    System.out.println("Select a valid option please");
                    break;
            }

        }while (option != 3);
    }
}
