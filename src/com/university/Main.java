package com.university;

import com.university.controller.UniversityController;
import com.university.model.Lesson;
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
        populateUniversity();
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

    private static void populateUniversity()
    {
        universityController.addStudent(new Student("Juan Camilo", "Argüelles Ardila", 21));
        universityController.addStudent(new Student("Juan David", "Duarte Hernadez", 24));
        universityController.addStudent(new Student("Sergio David", "Buitrago Mesa", 22));
        universityController.addStudent(new Student("Juan Diego", "Castellanos Jerez", 21));
        universityController.addStudent(new Student("Daniela Maria", "Fonseca Perez", 18));
        universityController.addStudent(new Student("Elizabeth", "Sanchez Corredor", 23));

        universityController.addLesson(new Lesson("Code", "302B"));
        universityController.addLesson(new Lesson("Maths", "101A"));

    }
}
