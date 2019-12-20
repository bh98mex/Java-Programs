package com.company;

/*
Student name  :Groza Sorin
Student number: B00727232
Class Test 12/12/2016
 */
public class TestPet {
    //created a class TestPet to test our Pet aplication
    //this cass will contain the main method
    public static void main(String[] args) {
        //time to create our first object
        Pet myPet = new Pet ("guineea pig","female",false, 2010,5);
        //we have  created our first object
        // we have assigned values for it in the constructor method
        Pet exoticPet = new Pet ("tortoise","Norm","male",true,75.000,1990,40);
        //we have created the second object and assigned different values for it
        myPet.setPet_name("Wendy");
        //using a setter we have setted the name of our first pet
        myPet.setPrice_paid(20.00);
        //using a setter we have set the price for our first pet
        myPet.showPet();
        //created a method to output the values for our object
        exoticPet.showPet();
        //we have done the same thing to output the second s object values
        myPet.printLifeExpectancy();
        //provided a code that will use a specific method from the Pet class to print out the life expectancy for the first object
        System.out.println( "Norm" + " has a an expectancy to live of "+exoticPet.getExpectancy(40)+ " years");
        //provided a code that will use a method from a method class to print out how much longer our second object has to live

    }//main method
}//class
