package com.university.ui;

import com.university.Main;

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
                    "\n3. List Student");
            System.out.print("Type the option::");
            option = Main.input.nextInt();

            switch (option)
            {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }

        }while (option != 4);
    }
}
