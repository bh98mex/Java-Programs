import java.util.Calendar;
////
//Student name: Leo Groza
//Student number: B00727232
//Software Development COM 168
//Due Date: 09/12/2016
//Coursework element 5
////
public class VinylCollection {
                                                                    //main class VinylCollection
                                                                    //public so we can get to it
        private int UID = 1;                                        //this is our identifier final cause it does not change once set
        private String ArtistName;                                  //most stuff should be private and have getter and setter functions
        private String RecordName;
        private double CostPrice;
        private double SalesPrice;
        private int YearOfIssue;
        private boolean IsThisASingle;

                                                                    //this is the default constructor we call it to get a version of the class
        public VinylCollection(){
            ArtistName = "an artist Formerly with a name";
            RecordName = "The first album";
            CostPrice = 1.0;
            SalesPrice = 10.0;
            YearOfIssue = Calendar.getInstance().get(Calendar.YEAR);// this is a standard function from a standard java library
            IsThisASingle = true;                                   //we already said it was called the first album
            UID = 1;                                                // this is a weird case, because UIDs are based on the system

        }
                                                                    //a constructor method that will call four variables

        public VinylCollection(String theArtistName, String theRecordName, int theYearOfIssue, boolean isItASingle){
            ArtistName =theArtistName;                              //"an artist Formerly with a name"
            RecordName = theRecordName;                             //defining the variables
            CostPrice = 1.0;
            SalesPrice = 10.0;
            YearOfIssue = theYearOfIssue;
            IsThisASingle = isItASingle;
            UID = 1;
        }
                                                                    //a constructor method taht will call all the variables
        public VinylCollection(String theArtistName, String theRecordName, int theYearOfIssue, boolean isItASingle, double theCostPrice, double theSalesPrice, int theID){
            ArtistName =theArtistName;                              //we define variables
            RecordName = theRecordName;
            CostPrice = theCostPrice;
            SalesPrice = theSalesPrice;
            YearOfIssue = theYearOfIssue;
            IsThisASingle = isItASingle;
            UID = theID;
        }


        public void printAllInfo(){
            String infoToPrint;                                     //we define variables that will help us build our method
            String isASingle;                                       // = IsThisASingle?"Single":"Album";
                                                                    //the above code line is exactly the code below but written in a short version
            if (IsThisASingle){
                isASingle = "Single";
            }
            else{
                isASingle = "Album";
            }

            infoToPrint = "Record Name: " + RecordName + " \n" +    //we create the output that we want to be called out
                    "Artist Name: " + ArtistName + " \n" +
                    "Sale Price: " + SalesPrice + " \n" +
                    "Cost Price: " + CostPrice + " \n" +
                    "Year of Issue: " + YearOfIssue + " \n" +
                    "Record type: " + isASingle + " \n" ;

                                                                    //System.console().writer().println(infoToPrint);
            System.out.println(infoToPrint);                        //to print our information(just as the code stated above)

        }
        public void updatePrices(double priceChange){               //create the method to call for the price update
            CostPrice = CostPrice + priceChange;
            CostPrice = Math.round (CostPrice * 100.0) / 100.0;
            SalesPrice =   SalesPrice + (2*priceChange);
            SalesPrice = Math.round (SalesPrice * 100.0) / 100.0;


        }

    public int getYearIssued(){                                     //method to call the year of the album

        return YearOfIssue;
    }

}
