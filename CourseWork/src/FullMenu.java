/*
Name: Leontin Groza;
Student Number: B00727232;
Assignment: Course Work;
Due Date: 13/02/2017.
 */
package company.com;
                                //import libraries
import sun.plugin.javascript.navig.Array;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import static Leo.G.Second_Menu.Menu_2;
                                //create a class that will extend the main class
                                //the class will hold methods that will create the menu
public class FullMenu extends company.com.Main {

    static Scanner keyboard = new Scanner(System.in);
                                //create a method for user input
                                //create variables used in the methods
    static int choice;
    static int number;
    static boolean ContinueInput = true;
    static int myArray[] = new int[10];
    static int plus = 0;

                                //create the main menu method
    public static void MainMenu() {
                                //create the main menu by hard coding
        System.out.println("Please chose from one of following:");
        System.out.println("1:Array;");
        System.out.println("2:Array List;");
        System.out.println("3:Exit.");
                                //the next lines of code will activate as soon as the user will input any data different from the requirement

        try {

                                //ask the user to chose option
            choice = keyboard.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Please enter a valid number...");
            keyboard.nextInt();

        }

                                //create switch cases related to the input choice of the user
        switch (choice) {
            case 1:
                                //call the menu methods according to input
                Menu_1();
                break;
            case 2:
                Menu_2();
                break;
            case 3:
                                //give the option to exit the program using an if statement
                if (choice == 3)
                    System.out.println("Thank you and goodbye");
                System.exit(1);
                                break;
            default:
                MainMenu();
        }

    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                    //create the first sub_menu
    public static void Menu_1() {
                                    //hard coding to output the menu
        System.out.println("\nArrays:\n");
        System.out.println("1: Enter the size of the Array and the input of the Array");
        System.out.println("2: Output the sum of numbers divisible by 3 from inside the Array");
        System.out.println("3: Return to main menu.");

        //the next lines of code will activate as soon as the user will input any data different from the requirement

        try {
                    //ask the user to chose option
            choice = keyboard.nextInt();


        } catch (InputMismatchException e) {
            if (false) {
                System.out.println("Please enter a number.");

            } else {
                Menu_1();
            }
        }

                    //create switch cases related to the input choice of the user

        switch (choice) {

            case 1:
                    //ask the user to input the numbers
                System.out.println("Enter the desired length of the array");
                number = keyboard.nextInt();
                System.out.println("Length of the array is " + number);
                System.out.println("Please enter numbers into the array");
                    //
                for (int i = 0; i < number; i++) {
                    myArray[i] = keyboard.nextInt();
                    if (myArray[i]>number+1){
                        System.out.println("Enter numbers according to the length specified");
                       Menu_1();
                    }

                    System.out.println(myArray[i]);

                }Menu_1();

                break;
                    //create a case to output specific calculus
                    //in this case, output the the sum of the numbers divisible by 3
            case 2:
                    //use a for loop
                for (number = 0; number <= 9; number++)
                    //use an if statement to find the numbers divisible by 3
                    if (myArray[number] % 3 == 0) {
                        plus += myArray[number];
                        continue;
                    }
                    //output the sum
                System.out.println("The sum of numbers is  " + plus);
                Menu_1();
                break;
                    //exit to the main menu
            case 3:
                MainMenu();
                break;
            default:
                System.out.println("Enter a valid option\n");
                Menu_1();


        }
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



