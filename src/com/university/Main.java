package com.university;

import com.university.model.Person;
import com.university.model.Student;

import java.util.Scanner;

public class Main {

    public static Scanner input = new Scanner(System.in);
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
            System.out.println("1. ");
        }while (option != 4);
    }
}
