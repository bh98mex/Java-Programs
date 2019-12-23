package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Created by leo on 13/03/17.
 */
public class Menu extends Main{

    static Scanner keyboard = new Scanner(System.in);
    static int choice;
    static boolean stop = false;


    public static void  Main_Menu (){

        System.out.println("1. Enter the menu;");
        System.out.println("2. Exit.");

        try {
            choice = keyboard.nextInt();

        }
        catch (InputMismatchException e){


            System.out.println("Please enter a valid number!!!");
            System.out.println("The system will now exit.");

        }


        switch (choice){
            case 1:
                subMenu();
                break;
            case 2:
                System.out.println("Have a nice day\n" +
                        "Goodbye");
                System.exit(0);
                break;
            default:
                Main_Menu();
                break;
        }


    }
    public static void subMenu(){
        System.out.println("1. Add a rental item;");
        System.out.println("2. Display the items available for rent;");
        System.out.println("3. Display the items currently rented;");
        System.out.println("4. Make item loan;");
        System.out.println("5. Return item;");
        System.out.println("6. Update item file;");
        System.out.println("7. Return to the main menu.");

        try {
            choice = keyboard.nextInt();
        }catch(Exception e){
            System.out.println("Please choose one of the sub menus!!!");
            subMenu();
        }
        switch(choice){
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 7:
                Main_Menu();
                break;
        }
    }



    }

