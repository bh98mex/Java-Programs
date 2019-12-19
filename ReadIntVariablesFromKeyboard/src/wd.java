import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner; //Importing scanner class.
/*
Name: Leo Groza
Student number: B007232,
Due Date: Tommorow.
 */
class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);  //Sets up an object of the Scanner class allowing
        //* us to use it to read values from the keyboard */
        int lenght, wide;
        System.out.println("Max value for the lenght is =");
        ////	then read from the keyboard
        // 	CODE returns the next keyboard input as a
        //		value of type int to the variable length
        lenght = keyboard.nextInt();
        System.out.println("max value for wide is =");
//read code from keyboard
        //Code returns the next keyboard input as wide
        keyboard.nextInt();
        System.out.println("Enter the value for wide..."+"/n");
        wide = keyboard.nextInt();

        System.out.println("Value entered for lenght =" + lenght);
        System.out.println("value entered for wide  +" + wide);
    }
}
