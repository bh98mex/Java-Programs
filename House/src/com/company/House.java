/*
Assignment 4 - COM 186;
Program:        House;
Student name:   Leo Groza;
Student number: B00727232;
Due date:       02/12/2016;
 */

package com.company;
import java.util.Scanner;                                    /*import a text scanner which can parse primitive
                                                             types and strings using regular expressions.*/

public class House {                                         // create the class HOUSE

    static Scanner keyboard = new Scanner(System.in);        //create a Scanner class that will scan for user input
    static String firstName;                                //define a static variable used through out the whole program

    public static void getName()                            //create a void method to perform a task
    {
        String input;                                       //define a variable
        input = "Welcome";
        System.out.println("\t\n" + input + "\n");
        System.out.println("Please enter your first name:");
        firstName = keyboard.nextLine();                    // ask for user input
        System.out.println("Hello " + firstName);
    }//get Name

    public static void getMenu()                            //create a second void method
    {                                                       //create the user menu
        System.out.println("Please chose a number from " +  //System.out.println is a Java statement that prints the argument passed,
                "the following menu:\n");                   //into the System.out which is generally stdout.
        System.out.println("1\tEnter your hometown\n");
        System.out.println("2\tEnter your street\n");
        System.out.println("3\tEnter your house number\n"); //use hard coding to create our menu
        System.out.println("4\tExit the system\n");
    }//print Menu

    public static void getAnswer()                          //create a third void method
    {
        String userTown;                                    //define String variables to be used
        String userStreetName;
        String userHomeNumber;
        int Answer;                                         //define int variable to be used
        Answer = keyboard.nextInt();

            switch (Answer) {
                case 1:                                                         //case 1(input first line of menu)
                    Answer = 1;
                    System.out.println("Please enter your hometown name");
                    userTown = keyboard.next();                                // get input from the user
                    System.out.println("Thanks " + firstName + " you live in " + userTown);
                    break;
                case 2:                                                        //case 2
                    Answer = 2;
                    System.out.println("Please enter your street name");
                    userStreetName = keyboard.next();                          //get input from user
                    System.out.println("Thanks " + firstName + " you live in " + userStreetName);
                    break;
                case 3:                                                        //case 3
                    Answer = 3;
                    System.out.println("Please enter your house number");
                    userHomeNumber = keyboard.next();                          //get input from user
                    System.out.println("Thanks " + firstName + " you live in house number " + userHomeNumber);
                    break;
                case 4:                                                       //case 4
                    Answer = 4;
                    System.out.println("Thank you " + firstName + " for your time...and goodbye.");
                    break;
                default:                                                     //default used for input mismatch
                    System.out.println("Incorrect choice " + firstName + " ... goodbye.");

        }
    }//getAnswer
    public static void main(String[] args)                  //create the main method to output
    {
        getName();                                         //first method : get the user name
        getMenu();                                         //print out the user menu
        getAnswer();                                       //retrieve the user answer

    }//main menu
}//class House
//P.S. The program will only work with integers, any other choice of input will crush the program.