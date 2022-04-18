package com.university;

import com.university.controller.UniversityController;
import com.university.model.Lesson;
import com.university.model.Person;
import com.university.model.Student;
import com.university.model.University;
import com.university.model.teacher.FullTimeTeacher;
import com.university.model.teacher.PartTimeTeacher;
import com.university.model.teacher.Teacher;
import com.university.ui.UILesson;
import com.university.ui.UIStudent;
import com.university.ui.UITeacher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
                    "\n3. Show Teacher menu"+
                    "\n4. Exit");

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
                    UITeacher.showMenu();
                    break;
                case 4:
                    System.out.println("See you soon!");
                default:
                    System.out.println("Select a valid option please");
                    break;
            }

        }while (option != 4);
    }

    private static void populateUniversity()
    {
        Student s1 = new Student("Juan Camilo", "Argüelles Ardila", 21);
        Student s2 = new Student("Juan David", "Duarte Hernadez", 24);
        Student s3 = new Student("Sergio David", "Buitrago Mesa", 22);
        Student s4 = new Student("Juan Diego", "Castellanos Jerez", 21);
        Student s5 = new Student("Daniela Maria", "Fonseca Perez", 18);
        Student s6 = new Student("Elizabeth", "Sanchez Corredor", 23);

        Teacher t1 = new FullTimeTeacher("Ivan", "Leal", 4);
        Teacher t2 = new FullTimeTeacher("Fernado", "Fonseca", 5);
        Teacher t3 = new PartTimeTeacher("Luis", "Castellanos", 6);
        Teacher t4 = new PartTimeTeacher("Genaro", "Vargas", 4);


        Lesson l1 = new Lesson("Code", "302B");
        Lesson l2 = new Lesson("Maths", "101A");

        try
        {
            l1.addTeacher(t1);
            l1.addStudent(s1);
            l1.addStudent(s2);
            l1.addStudent(s3);

            l2.addTeacher(t2);
            l2.addStudent(s2);
            l2.addStudent(s3);
            l2.addStudent(s4);

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        List<Student> students = Arrays.asList(s1, s2, s3, s4, s5, s6);
        students.forEach(universityController::addStudent);

        List<Teacher>teachers = Arrays.asList(t1, t2, t3, t4);
        teachers.forEach(universityController::addTeacher);

        List<Lesson>lessons = Arrays.asList(l1, l2);
        lessons.forEach(universityController::addLesson);

    }
}
