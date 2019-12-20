package com.company;

import java.util.Scanner;	// importing Scanner class

class Accommodation{

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number,postcode;
        String adress="Brenthurst Road";


        System.out.println("Enter the house number");
        number=keyboard.nextInt();

        System.out.println("Enter the postcode please");
        postcode=keyboard.nextInt();

        int a=102,year=2017;
        double b=899.999;
        String name1="January", name2="detached garage",city="London";

        System.out.print("Street             :");
        System.out.print("   Brenthurst Road\n");
        System.out.print("Full postcode      :");
        System.out.print("   NW" + a+ "\n");
        System.out.print("Council            :");
        System.out.print("   Brent London Boro\n");
        System.out.print("Country            :");
        System.out.print("   United Kingdom\n");
        System.out.print("Rooms              :");
        System.out.print("   1- double bedrooms\n");
        System.out.print("                       1-living space\n");
        System.out.print("                       2-single rooms\n");
        System.out.print("                       1-kitchen\n");

        System.out.print("Market Value       :");
        System.out.print("   Around " +b + "£\n" );
        System.out.print("Optional           :");
        System.out.print("   This house is having a " + name2 +"as well\n");
        System.out.print("This is house will be available to sell it from " + name1 +  year +  "\n");
        System.out.print("\n");
        System.out.println("This was my presentation about my house from " + city);


    }// close brace of the main method
}// close brace of the class
