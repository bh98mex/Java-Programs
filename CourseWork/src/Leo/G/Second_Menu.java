/*
Name: Leontin Groza;
Student Number: B00727232;
Assignment: Course Work;
Due Date: 13/02/2017.
 */

package Leo.G;
                        //import the libraries that we need
import company.com.FullMenu;
import java.util.InputMismatchException;
import java.lang.ArrayIndexOutOfBoundsException;
import java.util.ArrayList;
import java.util.*;
                        //create a class that extends the FullMenu class
public class Second_Menu extends FullMenu {
                        //create the input method for the user
    static Scanner keyboard = new Scanner(System.in);
                        //declare static variables to be used through out the method
    static int choice_Array;
    static int number_Listsize = 0;
    static double ArrayNumbers[] = new double[number_Listsize];
    static double user_input = (byte) 0.0;
    static double pluss;
    static double count;
                        //create the second sub menu
    public static void Menu_2() {
                        //use hard coding to output the menu
        System.out.println("\nArray List;\n");
        System.out.println("1: Read the numbers in the Array List;");
        System.out.println("2: Exit.");

        //declare ArrayList
        ArrayList<Double> ArrayNumbers = new ArrayList<Double>();
        //the next lines of code will activate as soon as the user will input any data different from the requirement
        try {
            choice_Array = keyboard.nextInt();
            keyboard.nextLine();
        } catch (InputMismatchException ex) {
            System.out.println("Please enter a valid number...");
            keyboard.nextLine();

        }
                    //use an if statement to give the user a chance to exit the program
        if(choice_Array!=-999)
                    //create a switch method for the options of the menu
            switch (choice_Array) {

            case 1:
                    //ask the user to define the length of teh array
                System.out.println("Enter the desired length of the array");
                    //avoid any typing errors
                try{
                    number_Listsize = keyboard.nextInt();
                }catch (InputMismatchException ex) {
                    System.out.println("Please enter a valid number...");
                    keyboard.nextLine();

                }
                    //output the size of the Array
                System.out.println("Length of the array is " + number_Listsize);
                System.out.println("Please enter numbers into the array according to size "+ number_Listsize );
                for (int i = 0; i < number_Listsize+1; i++) {
                    //adding the numbers in the array list
                    //again looking for typing errors
                    try{
                        user_input = keyboard.nextDouble();
                    }catch (InputMismatchException ex) {
                        System.out.println("Please enter a valid number...");
                        keyboard.nextLine();

                    }

                    ArrayNumbers.add(user_input);
                    System.out.println(ArrayNumbers.add(user_input));

                    //using an if statement the program will calculate the sum of the numbers divisible by 3
                    if (user_input % 3 == 0&& user_input!=-999) {
                        pluss += (int) user_input;
                        System.out.println("The sum of numbers divided by 3 is \n " + pluss);
                        MainMenu();
                    }

                }
                    //use the last case to exit the program
            case 2:
                System.out.println("To exit to the main menu ");
                MainMenu();
                break;
                default:
                    System.out.println("Please chose a valid option");
                    Menu_2();
        }else{
            System.out.println("Return to the main menu");
        }MainMenu();


    }
}








