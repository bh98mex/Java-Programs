////
//Student name: Leo Groza
//Student number: B00727232
//Software Development COM 168
//Due Date: 09/12/2016
//Coursework element 5
////

public class TestVinylCollection {


    public static void main(String[] args) {
                                                                                        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");

        VinylCollection myFirst = new VinylCollection("Bob Smith", "Sham", 1980, true); //order is important when naming variables in constructor method

                                                                                        //Issue, boolean isItASingle, double theCostPrice, double theSalesPrice, int theID)
        VinylCollection yourFirst = new VinylCollection("Bonnie Raitt", "Nick of Time", 1989, false, 6.25, 11.99, 201516);

        myFirst.printAllInfo();                                                         //call the method to print info on "myFirst"
        yourFirst.printAllInfo();                                                       //Call the method to print info on "yourFirst"
        System.out.println(myFirst.getYearIssued());                                    //print out the issue year for myFirst

        yourFirst.updatePrices(-3.75);                                                  //print the updated prices for "yourFirst"

        yourFirst.printAllInfo();                                                       //with the last line of code we'll print all the info for "yourFirst"
    }

}