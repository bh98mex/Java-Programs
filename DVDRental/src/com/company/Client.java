package com.company;
import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by leo on 13/03/17.
 */
abstract class Client {
    static Scanner keyboard = new Scanner(System.in);


    private static String name,address,tel,dateOfRent;

    public Client(){} //create a default constructor (Just in case)

    public Client (String name,String address, String tel, String dateOfRent) {
    }

    public static String getName() {
        System.out.println("Please enter name:");
        name = keyboard.nextLine();
        return name;
    }

    public static String getAddress(int houseNumber, String street,String town) {
        System.out.println("Please enter the house number:");
        houseNumber = keyboard.nextInt(); keyboard.nextLine();
        System.out.println("Please enter the street name:");
        street = keyboard.nextLine();
        System.out.println("Please enter town name:");
        town = keyboard.nextLine();
        address = (int)houseNumber+ (String)street+(String)town;
        return address;
    }

    public static int getDateOfRent(int dateOfRent) {
        System.out.println("Enter the date:");
        dateOfRent= Calendar.DAY_OF_MONTH;
        return dateOfRent;
    }

}


