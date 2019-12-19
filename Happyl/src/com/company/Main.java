package com.company;
import java.util.Scanner;
import java.math.BigInteger;


public class Main {

    private static Object Yes;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
    String input; //declare a String Variable,
    char letter;  //declare a caracter variable letter,
                  //Prompt for and accept a String object typed at the keyboard and assign it to the variable input.
        System.out.println("Are you happy? (Yes=Y, No=N)");
        //the code below converts
        input=keyboard.nextLine();

        letter = input.charAt(0);

        switch (input){
            case"Y":
                System.out.println("You are happy");
                break;
            case "N":
                System.out.println("You are sad");
                break;
                default:
                    System.out.println("Probably is small caps");
        }
    }
}
