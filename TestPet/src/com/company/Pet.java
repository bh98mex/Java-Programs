/*
Student name  :Groza Sorin
Student number: B00727232
Class Test 12/12/2016
 */

package com.company;

public class Pet {
    //creating a class called Pet that will store the information on the animals that can be keept as domestic pets
    //after creating the class we will provide variables
    String Kind_of_of_pet;
    String Pet_name;
    String Gender;
    boolean Needs_a_license;
    double Price_paid;
    int Born;
    int Expectancy;

//    String Kind_of_of_pet; --as sequence of characters
//    String Pet_name; --as sequence of characters
//    String Gender; --as sequence of characters
//    boolean Needs_a_license; -- as a true  or fals value
//    double Price_paid; --as a real number
//    int Born; --as an integer
//    int Expectancy; --as an integer

    //the next step is to create the constructor methods
    //we will create three constructor methods

    public Pet (){
        //this is the default constructor method
        //		A CONSTRUCTOR METHOD allows us to build/instantiate
        //		Every class MUST have at least 1 CONSTRUCTOR METHOD
        //		You can have more than 1 constructor method
        //		This is the DEFAULT CONSTRUCTOR METHOD - Note the name/identifier
        //		It MUST have the same name as the Class (in this case Pet)
        //		Note there is NO CODE within this method
    }//constructor method
    public Pet(String kind_of_of_pet, String gender, boolean needs_a_license, int born, int expectancy) {
        //this is a constructor method that knows used whenever we know only 5 value
        //the remaining values are unknown and will not be passed through the method
        //if they will be passed their result will count as null
        //we have used our own identifiers to create the method
        Kind_of_of_pet = kind_of_of_pet;
        Gender = gender;
        Needs_a_license = needs_a_license;
        Born = born;
        Expectancy = expectancy;
    }//alternative constructor method
    public Pet(String kind_of_of_pet, String pet_name, String gender, boolean needs_a_license, double price_paid, int born, int expectancy) {
       //I have created a constructor method to be used when all the instance variables are known and
        //are available to be passed as parameters
        Kind_of_of_pet = kind_of_of_pet;
        Pet_name = pet_name;
        Gender = gender;
        Needs_a_license = needs_a_license;
        Price_paid = price_paid;
        Born = born;
        Expectancy = expectancy;
    }//alternative constructor method to output all the variables
    public void showPet(){
        //create an instance object method that will print out all the details of the pet object
        System.out.println("This is a "+ Kind_of_of_pet+ " and it's name is "+Pet_name);
        System.out.println("It is a "+Gender+ " and the price value of it is "+Price_paid+" pounds");
        System.out.println("It was born in "+Born);
        System.out.println("Has a life expectancy of "+Expectancy+" years");
        System.out.println("Does it require a license? "+Needs_a_license);

        if(Needs_a_license){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }//showPet
    public void setPet_name(String pet_name) {
        //we added an instance variable to set the name
        //also called a setter method
        Pet_name = pet_name;
    }//setPet_name
    public void setPrice_paid(double price_paid) {
        //created a setter for the price
        Price_paid = price_paid;
    }//setPrice
    public int getExpectancy(int realexpectancy) {
        //created a method to get the life expectancy
        //also known as a getter
        Expectancy=realexpectancy;
        //will return a value
        return Expectancy;
    }//getExpectancy
    public void printLifeExpectancy(){
        //create a method that calls and prints out a result returned
        System.out.println("The life expectancy is "+Expectancy+ " years");
    }//printLifeExpectancy
    public int getBorn() {
        //method that will return the age of the pet
        //and will return a value
        //getter
        return Born;
    }//getBorn
    public int leftToLive(){
        //this method will return a value
        //will return the expected time of life
        int leftToLive = Expectancy-2;
        return leftToLive;
    }
}
