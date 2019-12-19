package com.company;
/*
Name:           Leo Groza
Student Number: B00727232
Project:        Assessment2
Due Date:       04/11/2016
 */
//We will create a public class named MyCourse2
 class MyCourse2 {
     //We'll write the code here
    //We will rewrite the program MyCourse1 using variables
    //int, String, long, double, final int, char
    public static void main (String []args){
            //first we will define some variables in connection with what we have in MyCourse1
                    //String allows us to store anything and everything that has to do with words, sentences, phone numbers, or even just regular numbers
      String String1    = "BSc (Honours) Computing Systems full-time \nFaculty: Computing and Engineering \nCourse Code: 6980\nAnwar ul Haq – Course Director\n";
      String String2    = "BSc Computing Systems has a duration of 3 years";
      String String3    = "  Courses included in the first year: \nSoftware Development I; \nStudy Skills and Professional Issues; \nMathematics for Computing; \nComputer Hardware; \nSystem in Organisations; \nSoftware Development II. ";
      String String4    = "  Courses included in the second year:";
      String String5    = "Human and Computer Interaction; \nNetworks; \nObject-oriented Programming; \nCommunications; \nDatabase Systems; \nDynamic Web Authoring.";
      String String6    = "  Courses included in the third year";
      String String7    = "Computing System Project; \nMobile Technology; \nOrganisational Process Focus; \nProject Management; \nWeb Applications Development; \nEmbedded Systems Design.";
      String String8    = "    Academic Team:";
      String String9    = "      Anwar ul Haq (Course Director).  \n PhD in Computer Science and Information Systems Birkbeck College, University of London.\n";
      String String10   = "      Faisal Hasmi.  \n M.Sc.in Information Technology, University of Huddersfield \n Post Graduate Diploma In Strategic Business in Information Technology.\n";
      String String11   = "      Usman Javed Butt. \n Approved Ethical Hacker Certification; \n MSc. Network & Computer Systems Security, University of Greenwich.\n";
        String String12   = String9 + String10 + String11;
        String FinalString= "Professional education for Professional Life";
                    //int is a high performance, streamlined beast for calculating numbers in the range -2,147,483,648 [-231]
        int int1 = 9000;
        int int2 = 27000;
                    //double  can represent larger (and smaller) numbers and can represent them with more than twice the precision
        double double1 = 2500;
        double double2 = 3300;
        double double3 = 3200;
                    //char is a single character, that is a letter, a digit, a punctuation mark, a tab, a space or something similar.
        char char1 = 'A';
        char char2 = 'B';
        char char3 = 'C';
                    //Having most of the variables defined we can start typing our code to be exactly the same as the one in MyCourse1.
        System.out.println("" + String1);
                    //And by using println + String we have our first output
        System.out.println("" + FinalString);
        System.out.print("\n");
                    //As per MyCourse1 the caracter '\n' is used in this case for linefeed
                    //we continue to use String variable to complete our code
        System.out.println("" + String2);
                    //we will combine the Strings to give us the correct output
        System.out.print ("" + String3);
        System.out.println("\n");
        System.out.println("" +String4);
        System.out.println("" +String5);
        System.out.println("\n");
        System.out.println("" +String6);
        System.out.println("" +String7);
        System.out.println("\n");
        System.out.println("" +String8);
        System.out.println("" +String12);
                    //Using the rest of the variables we'll write the rest of the code
        System.out.println("Tuition fee per year is GBP " + int1);
        System.out.println("The payments are divided in three:");
                    //we are going to use the char variable and the double variable to get our output
      System.out.println("  " +char1);
      System.out.println("First payment = " + double1);
      System.out.println("  " +char2);
      System.out.println("Second payment = " + double2);
      System.out.println("  " +char3);
      System.out.println("Third payment = " + double3);
      System.out.println("Total amount to pay in three years is GBP " + int2);
      System.out.println("\n");
      System.out.println("The theme of the University is\n   "   +FinalString);
                     //By using the variables we have arrived to an end a lot easier in MyCourse2 that MyCourse1
                    //The main point is that if you have your variables defined it is going to be a lot easier to
                    //write the code in an extensive mode





    }
}
